package day07nestedIf;

import java.util.Scanner;

public class NestedIfcalisma {

	public static void main(String[] args) {
		// 
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir Yil giriniz");
		
		int year=scan.nextInt();
		
		if (year%100==0) {
			
			if(year%400==0)  {
				
			System.out.println("Artik yil yani 29 ceken yil");
				
			}else {
				System.out.println("Artik yil degil ");
			}
		} else if (year%100!=0) {
				
		  if(year%4==0) {
					System.out.println("Artik yil ");
			}else {
					System.out.println("Artik yil degil ");
			}
				
			}
		 scan.close();
		
	}	
	

}
