package day11stringmethods;

public class StringmMethods02substring {

	public static void main(String[] args) {
		// 
		
		
		//  substring()  methodu  bir string in belli bir bolumunu  kesip almak icin kullanilir .
		
		//

		String str1 ="Java calisana kolaydir";
		
		
		// substring() 1. versiyonu 
		
		
		System.out.println(str1.substring(5));// 5 index i  gosterir  oradan itibaren kesil  ekrana yazilir 
		
		// 5  kesilen  kisma dahil olur ...  5 den itibaren 
		
		
		System.out.println(str1.substring(8)); //  isana kolaydir . index 8  dahildir . inclusive demek 
		
		System.out.println(str1.substring(22));//  ekranda  hic bir sey goremeyiz  cunku  21  r  sonraki  ""  hicbirsey 
		//System.out.println(str1.substring(23));//  exception  hata  verir  index  23  yok ama ben olmayan bir yerden kesmek istiyorum bu bir hatali istek dir 
		
		System.out.println(str1.substring(0)); //  0 kullanmak mantikli degildir   str1.substring(0)= str1  oldugundan substring(0)  hic kullanilmaz 
		
		////
		
		// substring()  2. version  ilk index  dahil ikinci index  dahil degil 
		
		System.out.println(str1.substring(5,13));   //  ilk index  ekranda  gorursunuz  ikinci  index  dahil degil dahilr [5,) 
		
		System.out.println(str1.substring(6,12));//......alisan......12 nolu index  dahil degil  11  e kadar dahil olur 
		
		System.out.println( str1.substring(6,6));// biri  dahil et digeri de dahil etme der ve ekranda  hic bir sey gorulmez ....
		
		//System.out.println(str1.substring(6,7));// hata  verir  cunku  7 den baslar  6 da dur demektir bu hatayi yapmayin 
		// her zaman ilk index  kucuk veya esit olmalidir ....
		
		//substring onemlidir .....
		
		
		  public static String cardHide(String c) {
		    
			  // Scanner scan=new Scanner(System.in);
			   
			    
			    String kartNum="1234123456785678";
			    
			    
			    //kartNum=replace("*",substring(0,12));
			    
		
	}

}
