package day06;

public class Ifstatement04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Bir tane Strin variable olusturun ve bir gun ismini kucuk harflerle deger olarak atayin
				// Eger atadiginiz deger hafta ici gunlerinden biri ise
				// ekrana “hafta ici” yazdirin.
				// Eger atadiginiz deger hafta sonu gunlerinden biri ise
				// ekrana “hafta sonu” yazdirin.
		
	
		String gun="Pazar";
		
		if(gun=="Pazar"|| gun== "cumartesi" ) {
			
			System.out.println("haftasonu");
			
		
		}
		if (gun.equals("pazartesi")  || gun.contentEquals("sali") || gun.contentEquals("carsamba")  || gun.contentEquals("persembe")  ||  gun.contentEquals("cuma"))
		
		{
			
			
			System.out.println("hafta ici" );
		}
		
		
		
		
		
		
		

	}

}
