package day17Constructors;

public class Constructors04 {

	int num1=12;
	
	static int num2=22;
	
	
	public static void main(String[] args) {
		
		
		//num1++;// Compile Time ERROR VERIR.. Static methodlarin icinde  sadece  static elemanlar kullanilir 
		
		// num1  static olmadigindan main methodun icinde kullanilamaz ...// commenti  kaldirirsak  java  kirmizi compile time error verir..
		num2++;
		// num2  static oldugundan  main methodun icinde kullanmamiz sorun olmaz ...
		
		
	}

}
