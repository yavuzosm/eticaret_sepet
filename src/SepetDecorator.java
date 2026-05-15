
public class SepetDecorator {
	
	
protected sepet sepetim;

	
	public SepetDecorator (sepet sepetim) {
		
		this.sepetim=sepetim;
		
	}
	public void sepetGoster() {
		sepetim.sepetGoster();
	}
	public double toplamFıyat() {
		return sepetim.toplamFıyat();
	}
	
	
	
}
