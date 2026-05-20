public class KargoDecorator extends SepetDecorator {

    private double kargoUcreti;
    
    public KargoDecorator(sepet sepetim, double kargoUcreti) {
        super(sepetim);
        this.kargoUcreti = kargoUcreti;
    }

    
    public double toplamFıyat() {
        return super.toplamFıyat() + kargoUcreti;
    }
    
    @Override
    public void sepetGoster() {
        sepetim.sepetGoster();
        System.out.println("Kargo Ucreti| " + kargoUcreti + " TL");
        System.out.println("TOPLAM (Kargo Dahil)| " + toplamFıyat() + " TL");
    }
}