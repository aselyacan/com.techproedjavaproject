package day14dowhileloop;

public class DoWhile02 {

	public static void main(String[] args) {
		
		
		// do-while ile while loop larin arasnda ki fark
		
		
		// do-while her halikarda bir defa  calisir 
		// while once kontrol eder  true or false diye ama dowhile  ise  once  yazdirir sonra kontrol eder ....
		
		
		// oyun yazarken dowhile  kullanmak  iyi  olur cunku bir defa  kullanici  veri girecek sonra  kazandi yada kaybetti  ekrana yazilicak
		
		int num1=9;
		while(num1<7) {
			System.out.println("While: " + num1); 
			num1++;
		}
		
		int num2=9;
		do {
			System.out.println("Do while: " + num2); 
			num2++;
		}while(num2<7);	
		
		
		

	}

}
