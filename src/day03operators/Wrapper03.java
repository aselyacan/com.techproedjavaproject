package day03operators;

import java.util.Scanner;

public class Wrapper03 {

	public static void main(String[] args) {


		
		//kullanicidan ad  ve soyadini  alalim ekrana  yazdiralim
		
		//kullanicidn adreisini  alalim ekrana  yazdiralim 
		
		//kullanicican  yasini  alalim ekrana yazdiralim 
		
		// kullaniciya  Turkiye yasiyorum.  Dogru/yanlis diye  soralim cevabini ekrana  yazdiralim,
		//true veya false  olarak 
		
		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("ad ve soyadinizi yaziniz");
		
		String tamIsim=scan.nextLine();
		
		System.out.println(tamIsim);
		
		
		System.out.println("Adresinizi yaziniz");
		
		String adres=scan.nextLine();
		
		System.out.println(adres);
		
		
		System.out.println("yasinizi giriniz");
		
	    int yas=scan.nextInt();
	    
	    System.out.println(yas);
	   
	   
	    System.out.println("turkiyede  yasiyorum.true/false");
	   
	    boolean blTr=scan.nextBoolean();
	     
	    System.out.println(blTr);
	     
	     
	     
	   
	   
	   
		
		
		
		
		
		
		
		
		
	}

}
