package day10Stringmethods;

public class StringMethod04 {

	public static void main(String[] args) {
		// contains() methodu  bir String in icin de bir charackterin olup olmadigini kontrol eder 
		// eger  o character  String  in icin de varsa "true"  yoksa "false"  return eder .
		
		
		
		String str1="karakartal";
        
		System.out.println(str1.contains("m")); // false cunku karakartal  in icinde  m harfi yok
		
		
		// contains() methodu  icine herzaman String koyun .
		
		System.out.println(str1.contains("kar")); // true cunku karakartal   in icinde  'kar'  var..
		
		
		
		// trim()  methodu  bir  String in ( bas ve sonunda ki bosluklari ) siler   ortadaki bosluk silinmez...
		
		//trim: yontmak, tras demek
		// sadece  bas ve sonda ki  bosluklari  siler , aradaki bosluklara  dokunmaz. 
		
		// isEmpth() methodu  bir Stringin icinde  characther olup olmadigina bakar 
		
		String str2=" Ali Can    ";
		System.out.println("trim() kullanmadan once:"+str2);
		
		System.out.println("trim() kullandiktan sonra:"+str2.trim());
		
		String str3="Ali";
		System.out.println(str3.isEmpty());// false cunku  String bos degil
		
		String str4=" ";
		System.out.println(str4.isEmpty());// false cunku space  de java icin bir character dir 
		
		String str5="1";
		System.out.println(str5.isEmpty());// true cunku  hic bir character yok     
		
		
		
	}

}
