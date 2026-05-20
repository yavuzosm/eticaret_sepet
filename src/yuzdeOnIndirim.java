
public class yuzdeOnIndirim implements  IndirimStrategy{

	
    @Override
    public double IndirimUygula(double toplamFiyat) {
       
        return toplamFiyat * 0.90;}
}
