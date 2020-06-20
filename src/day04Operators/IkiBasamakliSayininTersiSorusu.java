package day04Operators;

import java.util.Scanner;

public class IkiBasamakliSayininTersiSorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

        //System.out.print("Enter an integer that you would like to have reversed: ");
       

        System.out.println(reverse(43));
	}

	public static boolean  reverse(int num){
		//Scanner input = new Scanner(System.in); 
		
		int a=num%10;
		int b=num/10;
		int c= a*10+b;
		
		if(num<c) {
			return false;
		}else {
			return true ;
		}
       
	}
	
	
}
