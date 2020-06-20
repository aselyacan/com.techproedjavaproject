package day09Switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
		 /*
		  * kullanici  haftanin gun numarasini girsin 
		  * Programiniz  gunun ismini  girsin 
		  * 
		  */

		Scanner scan=new Scanner(System.in);
		System.out.println("gun numarasi  girini");
		
		int gun=scan.nextInt();
		
		switch(gun) {
		case 1:
			System.out.println("pazartesi");
		break;
		case 2:
			System.out.println("sali");
		break;
		case 3:
			System.out.println("carsamba");
		break;
		case 4:
			System.out.println("persembe");
		break;
		case 5:
			System.out.println("cuma");
		break;
		case 6:
			System.out.println("cumartesi");
		break;
		case 7:
			System.out.println("pazar");
		break;
		
		default:
			System.out.println("gecerli gun numrasi girininiz ");
		
		}
		
		  
	}

}
