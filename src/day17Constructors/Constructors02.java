package day17Constructors;

public class Constructors02 {

	
	// buyume methodu bu class da degil Constructors 01 classin da , o yuzden java kullanmama  musade etmiyor...
	
	// baskasinin malini kullanmaya musade etmez
	
	//  eger baska bir class da ki methodu kullanmak istiyorsak  
	// o class dan bir tane  obje olusuturup  
	// o obje  sayesinde  istedigimiz  methodu  kullanabiliriz
	
	public static void main(String[] args) {
		//buyume(33); calismaz cunku o constructors 01 de ....
		
		Constructors01 obj1=new Constructors01();
		
		// Buyume  methodu  static oldugundan Java  object  kullanarak  buyume() methodunu  cagirmamzi  istemez
		// ve  kodun altini sari  renkle cizer
		
		
		obj1.buyume(33);
		Constructors01.buyume(45);//46  altta  sari cizgi cikmadi cunku  Class ismiyle cagirdik  cunku static 
		obj1.isimDegistir("Kemal Can");
		Constructors01.isimDegistir("Merhaba Yusuf Pasa");//  Class ismiyle cagirdik sari cizgi  cikmadi ...  cunku  static 
		
		  // ekran da 34  gorecegiz 
		
		System.out.println(obj1.isim);
		System.out.println(obj1.yas);
		
		// bir variable veya  method  static  olarak olusturulmussa  o variable veya  methoda  Object  olusturmadan  sadece Class 
		//  ismini kullanarak ulasabilirsiniz
		
		System.out.println(Constructors03.ad);//iskender demirkan
		System.out.println(Constructors03.kilo); // 33
		Constructors03.arttirma(45);//46
		Constructors03.degistirme("Merhaba Naci");// Merhaba Naci//
	}

}
