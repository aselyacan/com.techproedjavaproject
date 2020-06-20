package day15methodcreation;

import java.util.Scanner;

public class ArtikYilSorusu {

	public static void main(String[] args) {
		
		
		 artikYil();

	}

	 public static void artikYil(){
	       Scanner in = new Scanner(System.in);
	     int yil=in.nextInt();
	     
	     if (yil%100==0 && yil%400==0){
	       
	       System.out.println("true");
	     }else if ( yil%100!=0 && yil%4==0){
	       System.out.println("true");
	     }else{
	       System.out.println("false");
	     }
	    
	  }
}
