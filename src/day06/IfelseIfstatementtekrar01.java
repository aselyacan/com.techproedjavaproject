package day06;

import java.util.Scanner;

public class IfelseIfstatementtekrar01 {

	public static void main(String[] args) {
	
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir rakam  giriniz");
		
		System.out.println("0 ile 100 arasinda bir sayi giriniz");
			
		Scanner scan1=new Scanner(System.in);
		int nm=scan1.nextInt();
		int nm1=scan1.nextInt();
		System.out.println("Lutfen  en ve boy giriniz");
		
		System.out.println("karenin alani "+(nm*nm1));
		
		System.out.println("Küpün alani "+(nm*nm*nm));
		
		int num=12;
		if (num>0) {
			System.out.println("pozitif deger girdiiniz");
		}
		
		String str1="Learn"+"Java";
		
		System.out.println(str1);
		
		int numa=1;
		int numb=34;
		String str2="Cok";
		String str3="Calis";
		System.out.println(str2+str3+numa+numb);
		
		scan.close();
		
		

	}

}
