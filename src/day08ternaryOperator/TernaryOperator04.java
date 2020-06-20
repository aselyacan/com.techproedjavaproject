package day08ternaryOperator;

import java.util.Scanner;

public class TernaryOperator04 {

	public static void main(String[] args) {
		// Ternary Operator  Nested TERNERY ice ice  ternary 
       
		//Kullanicidan bir sayi aliniz
		//Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
		//10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
		//Sayi o dan kucuk ise ekrana "Negatif Sayi" yazdiriniz
	
		
		
		// Kullanicidan bir sayi aliniz
		// Sayi cift ise 10 bolunup bolunmedigini kontrol ediniz
		// Sayi 10 a bolunuyorsa “Wooow 10” yazdiriniz, 10 a bolunmuyorsa “Yazik 10" yazdiriniz
		// Sayi tek ise 5 e bolunup bolunmedigini kontrol ediniz
		// Sayi 5 e bolunuyorsa “Wooow 5” yazdiriniz, 5 e bolunmuyorsa “Yazik 5" yazdiriniz tek ise "WOOW 10" yazdiriniz ,  10 bolunmuyorsa  "Yazik 10" yazdiriniz
         Scanner scan = new Scanner(System.in);
        
        System.out.println("2 tam sayi giriniz");
        int  num1 = scan.nextInt();
	    int  num2=scan.nextInt();
        
        int result= num1>num2 ?   (num1) :( num2) ;
        System.out.println(result);
	    
        scan.close();
	}
	
	

}
