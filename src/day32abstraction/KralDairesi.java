package day32abstraction;

public class KralDairesi extends Otel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KralDairesi musteri3= new KralDairesi();
		musteri3.kahvali();
		System.out.println("Internatinal Tv :"+musteri3.tv("international", 12));
		System.out.println("wifi: "+musteri3.wifi(11));
	}

	public void kahvali() {
		
	}
	public int tv(String international, int saat) {
		if(international.equals("international")) {
			return saat*5;
		}else {
			return 0;
		}
	}

	@Override
	public void kahvalti() {
		// TODO Auto-generated method stub
		System.out.println("Kahvaltiniz teras kat Kral Restaurant dadir" );
	}
}
