package day09Switchoperator;

import java.util.Scanner;

public class SwitchHomework03 {

	public static void main(String[] args) {
		// uc basamak li iki basamakli  bir basamkli tam sayi sorususu  if else if ve  switch ile 
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int num=scan.nextInt();
		
		
		if (num<10 && num>=0) {
			
			num=9;
			
		}else if (num>=10 && num<100) {
			num=99;
		}else if (num<1000 && num>=100) {
			num=999;
			
		}
		
		
		
		
		
		switch (num) {
		case 9:
			System.out.println("Bir basamakli ");
		break;
		case 99:
			System.out.println("iki basamakli ");
		break;
		case 999:
			System.out.println("uc basamakli ");
		break;
		default :
			System.out.println("yorum yok  ");
		break;
			
		}
		
		
	}

}
