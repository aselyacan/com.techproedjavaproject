package day06;

public class ifstatement03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//char   variable  olusuturun ve  buyuk  harf  deger  atayin
		
		
		// eger atanan deger, haftanin gunlerinden birinin  ilk harfi ise o gunleri yazdirin
		
		
		// eger atanan deger  , haftanin gunlerinden herhangi birinin ilk harfi degilse  boyle bir yok yaz
		
		
		
		char gun='C';
		
		
		if(gun=='C') {
			
			
			System.out.println("CARSAMBA CUMA CUMARTESI");
					
		}
		
		if(gun=='S') {
			
			System.out.println("Sali");
			
			
		}
		
		// "p" olmamamak VEYA "C" olmamak VEYA  "S" olmamak    VEYA isareti ||(pipe denir)
		
		// || veya  isleminden  true  sonucu alabilmek icin  bir tanesinin  True  olmasi yeterlidir 
		
		// true||true=true <-> true||false=true <->  false||false =false 
		
		// || toplamaya benzer
		
		
		
		
		//&&  VE  isareti demek 
		
		// &&  islemi  carpmaya  bener 
		
		// &&(and)  leminden tum  condition lar  true  olmalidir ...
		
		//true&& true= true <-> true && false<->  false && false= false 
		
		
       if(gun!='P'|| gun!='C' || gun!='S')
    	   
    	   System.out.println("boyle bir gun yok");
       
       
       
       
       
       
       
       
       
       
    	   
   
       }
       
       
       
	}
