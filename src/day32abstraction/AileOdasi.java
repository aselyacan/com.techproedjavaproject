package day32abstraction;

public class AileOdasi extends Otel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AileOdasi musteri2 = new AileOdasi();
		musteri2.kahvalti();
		System.out.println("Wifi Ucretiniz: " + musteri2.wifi(6));
		
	}

	@Override
	public void kahvalti() {
		System.out.println("Kahvaltiniz cafeteria da olacaktir");
	}

}
