
public class UrunFactory {
	
	public static urun urunOlustur(String Ad,double urunFiyat,int urunAdet) {
		
		
		if (Ad == null || Ad.isEmpty()) {
		    System.out.println("Hata: Urun adi bos olamaz!");
		    return null;
		}

		if (urunFiyat <= 0) {
		    System.out.println("Hata: Fiyat sifirdan buyuk olmali!");
		    return null;
		}

		if (urunAdet <= 0) {
		    System.out.println("Hata: Adet sifirdan buyuk olmali!");
		    return null;
		}

		return new urun(Ad, urunFiyat, urunAdet);
	}

}
