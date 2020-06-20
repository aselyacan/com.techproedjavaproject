package day18Statickeyword;

public class Static01 {

	static int en=12;
	static int boy=10;
	static int yaricap=4;
	static int alan;
	static double pi;
    // eger bir variable i  olusruruken  hesap yapmamiz gerekirse
	// static  block  olusturmak   iyidir ...  yani  in alan=en*boy  demek yerine  
	// static block  olusturup  bu islemleri  static block  un icine  yazmak daha iyidir 
	// static block   variable  lara deger  atamak icin de  kullanabilir.
	// static  block  class in icinde  ve butun method larin (main method ) da dahil  constructors  larin da disinda  
	// olusturulmalidir..
	// static  block  class olusturuldugu zaman olusur .
	// static  block tum method lardan ve  constructors lardan once calisir  calisma onceligi var dir ....
	//  ustte  asagiya ilk once gelen static  block calisiri
	
	static {
		pi=3.14;
	}
	static {
		alan=en*boy;
		
	}
	
	
	public static void main(String[] args) {
		
	}
	
	// static class olusturulabilir ama alt classlar static  olabilir (inner class)
	// ust class lar static olamazlar (outer or  sub class)
	
	
	public  static class AltClass{ // static de olabilir olmayabilir de 
		
	}
	
	
	
	
	
	
	
	
	
	

}
