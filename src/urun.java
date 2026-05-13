
public class urun {
	
	private String urunAdi;
	private double urunFiyat;
    private int urunAdet;
    
    
    public urun (String urunAdi , double urunFiyat , int urunAdet ) {
    	
    	
    	this.urunAdi=urunAdi;
    	this.urunAdet=urunAdet;
    	this.urunFiyat=urunFiyat;
    	
    }
    
    public double geturunFiyat() {
    	return urunFiyat;
    }
    public String  geturunAdi() {
    	return urunAdi;
    }
    public int geturunAdet() {
    	return urunAdet;
    }
    
}
