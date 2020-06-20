package day06;

public class IfStatement01 {

	public static void main(String[] args) {
		
		//javada butun keywordlar sadce  kucuk harfle yazilir  ...Non primitiv haric
		
		
		
		
		
		   if(3>2) {   // ()  parantezin icine Kosul yazacagiz  conditon  yazacagi---
			
			System.out.println("If BODY  CALISTI");
			
			
			if(3>4) {
				System.out.println("If body  calisti");
				}
			System.out.println("if body calismadi");
			
			
			//java yukaridan asagiya dogru calisir---Onemli 
			
			// Bir  int variable olusturun  ve ona bir deger  atayin.
			
			// Eger  atadigimiz  deger  pozitif ise  ekrana  "pozitiv  yazdirin "
			
			// Eger  atadigimi  deger negatif ise ekrana  "negatif  " yazdirin
			
			int a=3;
			if(a>0) {
				
				System.out.println("Pozitif"+a);	
			}
			
			if(a<0) {
				
				System.out.println("negatif"+a);
				
				// 0 isaretsiz bir sayi dir ...	
			}
			
			
			int num1=-10;
			
			if(num1<0) {
				System.out.println("negatif "+num1);
			}
		
			if(num1==0) {
				
				System.out.println("Nötr");
				
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
