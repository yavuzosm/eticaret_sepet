
public class TaksitliOdeme implements OdemeStrategy {
	
	
		@Override
		public double OdemeYap(double toplamFiyat) {
			double taksitliFiyat = toplamFiyat * 1.05;
	    //   System.out.println("Taksit ile odeme yapildi: " +taksitliFiyat + " TL (%5 taksit farkı uygulandı)");
	        return taksitliFiyat;
		}

	}



