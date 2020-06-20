package day10Stringmethods;

public class StringMethod02 {

	public static void main(String[] args) {
		
		
		// lastIndexOf()  methodu  aradiginiz  charackter in String icinde ki  son gorunumuun  indexini  return eder 
		
		//  lastIndexOf() methodu 1. versiyonu 
		
		String str1="Sivrihisar";
		System.out.println(str1.lastIndexOf('i'));  // ekrana  6 yazdirir . cunku  'i' characterinin  String  icnde son gorunu index 6 dir .
		
		
		
		System.out.println(str1.lastIndexOf('r'));
		
		// lastIndexOf()  methodu  2.versiyonu 
		
		System.out.println(str1.lastIndexOf('i',7));// ilk 7 characterin icinde  'i'harfinin son gorunumu arar
		
		// indexi ni  return  eder sayi degerini verir  kelime icinde....index  0 dan baslar 
		
		
		
		// lastIndexOf() methodu  3. versiyonu   String methodu 
		
		
		String str2="rivrihisari";
		System.out.println(str2.lastIndexOf("ri"));
		
		// String in icinde ki  'ri' in son gorunumunu bulacak.
		// son 'ri'  de 'r' harfini indexi olan 9 return edecek 
		
		
		
	}

}
