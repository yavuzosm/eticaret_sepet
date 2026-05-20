
public class KrediKartiOdeme  implements OdemeStrategy{

	
	@Override
	public double OdemeYap(double toplamFiyat) {
		// System.out.println("Kredi karti ile odeme yapildi||" + toplamFiyat + " TL");
	        return toplamFiyat;
	}
}
