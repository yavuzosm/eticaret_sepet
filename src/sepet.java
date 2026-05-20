
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sepet {

private List<urun>urunler = new ArrayList<>();
private IndirimStrategy indirimStrategy;
private OdemeStrategy odemeStrategy;
private List<SepetObserver> observers = new ArrayList<>();

public void urunEkle(String urun, double fiyat, int adet) {
    urun yeniUrun = UrunFactory.urunOlustur(urun, fiyat, adet);
    if (yeniUrun != null) {
        urunler.add(yeniUrun);
        haberVer(urun + " sepete eklendi! Fiyat: " + fiyat + " TL");
    }
}
public void urunSil(String urunAdi) {
    for (int i = 0; i < urunler.size(); i++) {
    	if (urunler.get(i).geturunAdi().equalsIgnoreCase(urunAdi)) {
            urunler.remove(i);
            haberVer(urunAdi + " sepetten silindi!");
            return;
        }
    }
    System.out.println(urunAdi + " sepette bulunamadi!");
}
public void indirimAta(IndirimStrategy strateji) {
    this.indirimStrategy = strateji;
}

public void odemeAta(OdemeStrategy strateji) {
    this.odemeStrategy = strateji;
}

public void observerEkle(SepetObserver observer) {
    observers.add(observer);
}

public void haberVer(String mesaj) {
    for (SepetObserver observer : observers) {
        observer.guncelle(mesaj);
    }
}




public double toplamFıyat() {
	
	double toplam=0;
	for(int i=0; i<urunler.size();i++) {
		  toplam += urunler.get(i).geturunFiyat() * urunler.get(i).geturunAdet();
}
    if (indirimStrategy != null) {
        toplam = indirimStrategy.IndirimUygula(toplam);
    }
    if (odemeStrategy != null) {
        toplam = odemeStrategy.OdemeYap(toplam);
    }
	return toplam;
	
}


public void sepetGoster() {
        System.out.println("    SEPET ");
        for (int i = 0; i < urunler.size(); i++) {
            urun u = urunler.get(i);
            System.out.println(u.geturunAdi() + " | " + u.geturunFiyat() + " TL x " + u.geturunAdet());
        }
        System.out.println("Ara Toplam| " + toplamFıyat() + " TL");
     
    }




public static void main(String[] args) {
    sepet s = new sepet();
    s.observerEkle(new KonsolObserver());
    Scanner scanner = new Scanner(System.in);
    System.out.println("Kac urun eklemek istiyorsunuz?");
    int urunSayisi = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < urunSayisi; i++) {

        System.out.println("Urun adi:");
        String ad = scanner.nextLine();

        System.out.println("Fiyat:");
        double fiyat = scanner.nextDouble();

        System.out.println("Adet:");
        int adet = scanner.nextInt();
        scanner.nextLine();

        s.urunEkle(ad, fiyat, adet);
    }
    System.out.println("Urun silmek ister misiniz? (1-Evet, 2-Hayir)");
    int silSecim = scanner.nextInt();
    scanner.nextLine();

    if (silSecim == 1) {
        System.out.println("Silinecek urun adi:");
        String silAd = scanner.nextLine();
        s.urunSil(silAd);
    }
    int indirimSecim = -1;
    while (indirimSecim < 1 || indirimSecim > 4) {
        System.out.println("Indirim secin:");
        System.out.println("1 - %10 Indirim");
        System.out.println("2 - %20 Indirim");
        System.out.println("3 - Ogrenci Indirimi (%5)");
        System.out.println("4 - Indirim Yok");
        if (scanner.hasNextInt()) {
            indirimSecim = scanner.nextInt();
            if (indirimSecim < 1 || indirimSecim > 4) {
                System.out.println("Gecersiz secim! Lutfen 1-4 arasi girin.");
            }
        } else {
            System.out.println("Gecersiz giris! Lutfen sayi girin.");
            scanner.next();
        }
    }

    switch (indirimSecim) {
    case 1:
        s.indirimAta(new yuzdeOnIndirim());
        s.haberVer("%10 indirim uygulandi");
        break;

    case 2:
        s.indirimAta(new yuzdeYirmiIndirim());
        s.haberVer("%20 indirim uygulandi");
        break;

    case 3:
        s.indirimAta(new OgrenciIndirim());
        s.haberVer("Ogrenci indirimi uygulandi");
        break;

    default:
        s.haberVer("Indirim uygulanmadi");
    }


    int odemeSecim = -1 ;
    while (odemeSecim < 1 || odemeSecim > 3) {
        System.out.println("Odeme yontemi secin:");
        System.out.println("1 - Kredi Karti");
        System.out.println("2 - Havale (%5 indirim)");
        System.out.println("3 - Taksit (%5 fark)");
        if (scanner.hasNextInt()) {
            odemeSecim = scanner.nextInt();
            if (odemeSecim < 1 || odemeSecim > 3) {
                System.out.println("Gecersiz secim! Lutfen 1-3 arasi girin.");
            }
        } else {
            System.out.println("Gecersiz giris! Lutfen sayi girin.");
            scanner.next();
        }
    }

    switch (odemeSecim) {
    case 1:
        s.odemeAta(new KrediKartiOdeme());
        s.haberVer("Kredi karti secildi");
        break;

    case 2:
        s.odemeAta(new HavaleOdeme());
        s.haberVer("Havale secildi");
        break;

    case 3:
        s.odemeAta(new TaksitliOdeme());
        s.haberVer("Taksit secildi");
        break;}

    KargoDecorator k = new KargoDecorator(s, 50);

    
    int hediyeSecim = -1;
    while (hediyeSecim < 1 || hediyeSecim > 2) {
        System.out.println("Hediye paketi ister misiniz?");
        System.out.println("1 - Evet (30 TL)");
        System.out.println("2 - Hayir");
        if (scanner.hasNextInt()) {
            hediyeSecim = scanner.nextInt();
            if (hediyeSecim < 1 || hediyeSecim > 2) {
                System.out.println("Gecersiz secim! Lutfen 1-2 arasi girin.");
            }
        } else {
            System.out.println("Gecersiz giris! Lutfen sayi girin.");
            scanner.next();
        }
    }

    if (hediyeSecim == 1) {
        HediyePaketiDecorator h = new HediyePaketiDecorator(s, 30);
        s.haberVer("Hediye paketi eklendi");
        h.sepetGoster();
    } else {
        k.sepetGoster();
        s.haberVer("Hediye paketi eklenmedi");
    }

    scanner.close();
}
}


