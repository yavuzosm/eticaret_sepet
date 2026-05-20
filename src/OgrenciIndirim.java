
public class OgrenciIndirim implements IndirimStrategy {
	
	
	@Override
	public double IndirimUygula(double toplamFiyat) {
		return toplamFiyat * 0.95;
	}

}
