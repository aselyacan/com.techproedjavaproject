package day28overriding;

public class TernaryTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=5;
		System.out.println(x>2? x<4? 10:8:7);
		
//		do {
//			int y=1;
//			System.out.println(y++ +" ");
//		}while (y<=10);
//		
		
		// Overriding: uyarlamak demektir.
				
		        // Parent’taki bir methodu Child Class’ında 
				// kendimize uyarlayarak kullanmamıza Overriding deniyor.
				// overriding yaparken method ismi ve parametreler değişmemeli. 
				// asla bu signature değiştirilmez.
				// Overriding’de method içerisindeki bodyler { } değiştirilebilir.
				// Parent içindeki method (ses) . bu methoda Method Overridden denir. EZBERLE
				// Child içerisindeki method (ses). bu methoda Method Overridding Method.
				// 4 Access Modifier var. private, default, protected, public.
				// Overriding yaptığımızda child in access modifier ile aynı olmalı veya daha geniş olmalıdır.
				// Parent Access modifier default olduğunda, 
				// Child Access modifier default, protected, public olabilir.
				// Child Parenta göre durum alır.
				// Parent public olduğunda child default olamaz. Child parent’ı daraltamaz, sınırlandıramaz
		      // kumandadaki ses tusuyla butun kanalların sesini degistirebiliyoruz.
		
		
	}
                
  
}
