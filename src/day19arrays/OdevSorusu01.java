package day19arrays;

public class OdevSorusu01 {

	static int i=1;
	
	public static void main(String[] args) {
     
		
		int i=1;
		for (OdevSorusu01.i=1;OdevSorusu01.i<10 ;OdevSorusu01.i++) {
			i=i+2;
			System.out.println(i+" instance olan i");//  OdevSorusu01 static i dir 
			                          //  int i=1 ise  instance yada local i dir 
			System.out.println();
			System.out.println(OdevSorusu01.i+"static olan i");
			
			// class ismiyle cagiriyorsak  o static demek tir 
			//  int i=1 olarak kullanirsak  local i yi cagirir
		}

	}

}
