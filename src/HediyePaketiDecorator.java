public class HediyePaketiDecorator extends SepetDecorator {

    private double hediyeUcreti;

    public HediyePaketiDecorator(sepet sepetim, double hediyeUcreti) {
        super(sepetim);
        this.hediyeUcreti = hediyeUcreti;
    }

    public double toplamFıyat() {
        return super.toplamFıyat() + hediyeUcreti;
    }

    @Override
    public void sepetGoster() {
        sepetim.sepetGoster();
        System.out.println("Hediye Paketi Ucreti| " + hediyeUcreti + " TL");
        System.out.println("TOPLAM (Hediye Dahil)| " + toplamFıyat() + " TL");
    }
}