
import java.util.ArrayList;
import java.util.List;


public class sepet {

private List<urun>urunler = new ArrayList<>();


public void urunEkle(String urun,double fiyat, int adet) {
	 
	   urun yeniUrun = UrunFactory.urunOlustur(urun, fiyat, adet);
	   if(yeniUrun!=null) {
           urunler.add(yeniUrun); 
	   }
	   
	   
}
public double toplamFıyat() {
	
	double toplam=0;
	for(int i=0; i<urunler.size();i++) {
		  toplam += urunler.get(i).geturunFiyat() * urunler.get(i).geturunAdet();
}


	return toplam;
	
}


public void sepetGoster() {
        System.out.println("    SEPET ");
        for (int i = 0; i < urunler.size(); i++) {
            urun u = urunler.get(i);
            System.out.println(u.geturunAdi() + " | " + u.geturunFiyat() + " TL x " + u.geturunAdet());
        }
        System.out.println("TOPLAM| " + toplamFıyat() + " TL");
    }




public static void main(String[] args) {
    sepet s = new sepet();
    s.urunEkle("Futbol Topu", 500, 2);
    s.urunEkle("Forma", 4500, 3);
    KargoDecorator k = new KargoDecorator(s, 50);
    k.sepetGoster();
   
    HediyePaketiDecorator h = new HediyePaketiDecorator(s, 30);
    h.sepetGoster();
}
}


