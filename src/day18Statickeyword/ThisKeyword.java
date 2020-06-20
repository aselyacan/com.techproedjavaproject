package day18Statickeyword;

public class ThisKeyword {
	
	int x=12;
	static int y=13;
	
	ThisKeyword(int x){
		         // this kullandigim zaman icinde bulundugum class daki 
		        // instance veya  static variable lara ulasmak istiroyrum demektir hemen kullanmak icindir 
		
	           // Constructors icinde kullanilir ve  variable deger atamak icin kullanilir this ....
		this("iskender");// icin de bulundugunuz class daki  parametresiz  contructori  cagirmak icin kullanilir 
		       // this() kullanilacaksa mutlaka  ilk satirda olmalidir 
		       //  aksi takdirde compile time error verir 
		       // this()   constructorslar arasinda seyahat  etmesine  fayda saglar ////
		this.x=x;
		
		System.out.println("Parametreli Constructor");
		
	}
    ThisKeyword(){
    	System.out.println("Parametressiz  consrtructor");
    }
    ThisKeyword(String str){
    	System.out.println("String parametreleli constructor");
    }
	public static void main(String[] args) {
		
		
		ThisKeyword obj1=new ThisKeyword(15);
		System.out.println(obj1.x);//  15  olur 
		
		
	}

}
