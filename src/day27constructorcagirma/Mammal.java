package day27constructorcagirma;

public class Mammal extends Animal  {

	public boolean dogum = true;

	public static void main(String[] args) {
		
		
		//Mammal mammal=new Mammal();
		
		Mammal mammal01=new Mammal(15);
		
		

	}

	public void feed() {
		System.out.println("Cocuklarini besler");
	}
	
	Mammal(){
		this(11);
		
		//super();
		// Parent de ki  parametresiz constructor i cagir 
		//this(); ayni class  icinde ki  parameresiz   construcotor cagirmak icin kullanilir 
		
		// Super() keyword u kullanmasaniz da  olur  ama bazilari  kullanir  sasirmayin 
		          // super()  kullanilacaksa  mutlaka  ilk satirda olmalidir
		          // super() ve this()  ayni  constructor in icinde  ayni anda kullanilamaz 
		          // cunku ikiside ilk satirda olmasi  gerekiyor  ki olmuyor 
		
		          
		System.out.println("Mammal parametresiz contructor");
	}
	
	Mammal(int age){
		super ();
		System.out.println("Mammal parametreli  constructor");
	}
	
	

}
