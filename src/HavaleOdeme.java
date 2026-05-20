
public class HavaleOdeme implements OdemeStrategy{
	@Override
	public double OdemeYap(double toplamFiyat) {
		double indirimli = toplamFiyat * 0.95;
      //  System.out.println("Havale ile odeme yapildi: " + indirimli + " TL (%5 indirim uygulandı)");
        return indirimli;
	}

}
