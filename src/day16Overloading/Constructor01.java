package day16Overloading;

public class Constructor01 {

	
	/*
	 * bir class dan object  uretmek icin  constructor  kullanilir classin ismiyle ayni olmalidir.. ama  return type  olmamali
	 */
	int price=20000;
	int year=2020;
	String make="Honda";
	String type ="Civic";
	
	
	public static void main(String[] args) {
		 // Class olusturdugumuzda  Java class la beraber bir Constructor olusturur.Biz onu her hangi bir code yazmadan direkt kullanabiliriz 
		// Default  Constructor denir ...onceden ayarlanmistir ..
		// Default  Constructorlar da hic bir parametre olmaz 
		//Default Constructor  ne zamana kadar yasar.  yenisi olusturunca  java  imha eder 
		// Default  Constructor  Class olusturuldugu anda java  tarafindan olusturulur 
		// Biz sonra  kendimiz constructor  olusturdugumuz zaman java  kendisininki imha eder yada iptal eder 
		
		Constructor01 hondaAraba=new Constructor01(); // bir tane  object uretildi 
		
		// Scanner  scan=new Scanner(System.in) da  default olmayan constructordir cunku  icinde parametre var 
		//4hamlede olusur
		  
//     data type      isim       object  constructor		
		
		
		System.out.println("Price"+hondaAraba.price);//20000
		System.out.println("Year"+hondaAraba.year);// 2020
		System.out.println("Make"+hondaAraba.make);//honda
		System.out.println("type"+hondaAraba);// civic 
		
		
		
		
		
	}

}
