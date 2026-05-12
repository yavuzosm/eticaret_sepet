
import java.util.ArrayList;
import java.util.List;


public class sepet {

private List<String>urunler = new ArrayList<>();
private List<double[]>fıyatlar = new ArrayList<>();
private String indirimKuponu;
private String kullanıcıSekli;

public void urunEkle(String urun,double fiyat, int adet) {
	 
	urunler.add(urun);
	fıyatlar.add(new double[]{fiyat,adet});	
}
public double toplamFıyat() {
	
	double toplam=0;
	for(int i=0; i<urunler.size();i++) {
		toplam+=fıyatlar.get(i)[0]*fıyatlar.get(i)[1];
}
if(indirimKuponu!=null)	{
	
	if(indirimKuponu.equals("YUZDE10")){
	toplam = toplam * 0.90 ;
	}
	
	else if(indirimKuponu.equals("YUZDE20")) {
		toplam = toplam * 0.80;
	}
	else if(indirimKuponu.equals("YUZDE50")) {
		toplam = toplam * 0.50;
	}
	}
if(kullanıcıSekli != null) {
	
	if(kullanıcıSekli.equals("VIP")) {
		toplam = toplam * 0.85;
	}
	else if (kullanıcıSekli.equals("OGRENCI")) {
		toplam = toplam * 0.95;
	}
}



	return toplam;
	
}

public void indirimKuponuGir(String Kupon) {
	this.indirimKuponu=Kupon;
	
}
public void kullanıcıSekliGir(String Sekil) {
	this.kullanıcıSekli=Sekil;
}


public void sepetGoster() {
	
	
	System.out.println("    SEPET     ");
	
	for(int i = 0 ; i < urunler.size();i++ ) {
		
		System.out.println(urunler.get(i)+"|"+ fıyatlar.get(i)[0]+"TL * " + (int)fıyatlar.get(i)[1]);
	}
	System.out.println("TOPLAM |" + toplamFıyat()+"TL");
	
}



public static void main (String[] args) {
	 sepet s = new sepet ();
	 
	 s.urunEkle("Futbol Topu", 500, 2);
	 s.urunEkle("Forma", 4500, 3);
	 s.indirimKuponuGir("YUZDE10");
	 s.kullanıcıSekliGir("OGRENCI");
	 s.sepetGoster();
		
}

}
