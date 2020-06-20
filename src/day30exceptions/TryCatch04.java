package day30exceptions;

public class TryCatch04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			hop();
		}catch (Exception e) {
			System.out.println(e);// burasi ise  technic  detayla beraber  cannot hop  yazisini  verir 
			System.out.println(e.getMessage());// exception u yakala sadece mesaji  goster demeke tir  
		}
		
	}
	private static void hop() {
		throw new RuntimeException("cannot hop");
	}

}
