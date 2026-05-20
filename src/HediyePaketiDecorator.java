public class HediyePaketiDecorator extends SepetDecorator {

    private double hediyeUcreti;

    public HediyePaketiDecorator(sepet sepetim, double hediyeUcreti) {
        super(sepetim);
        this.hediyeUcreti = hediyeUcreti;
    }

    public double toplamFıyat() {
        return sepetim.toplamFıyat() + hediyeUcreti;
    }

    @Override
    public void sepetGoster() {
        sepetim.sepetGoster();
        double odenenTutar = sepetim.toplamFıyat();
        System.out.println("Hediye Paketi Ucreti| " + hediyeUcreti + " TL");
        System.out.println("GENEL TOPLAM| " + (odenenTutar + hediyeUcreti) + " TL");
    }
}