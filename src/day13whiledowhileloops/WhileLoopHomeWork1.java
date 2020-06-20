package day13whiledowhileloops;

import java.util.Scanner;

public class WhileLoopHomeWork1 {

	public static void main(String[] args) {
		/*While loop kullanarak 3 den 13 e kadar tum tek tamsayıları ekrana yazdırınız.
		 * 
		 */
		
		
		int num=3;
		
		while (num<=13) {
			
			System.out.print(num+" ");
			
			num+=2;
		}
	
		/*
		Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden başlayıp bitiş değerinde
		biten tüm tamsayıları while loop kullanarak ekrana yazdırınız.
		*/
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen bir tamsayi giriniz ");
		
		int num1=scan.nextInt();
		
	
		System.out.println("bitis tamsayisini giriniz");
		
		int num2=scan.nextInt();
		
		
		while(num1<=num2) {
			System.out.print(num1+" ");
			
			num1++;
			
		}
		
		
		/*
		 * Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
            başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları while loop kullanarak
              ekrana yazdırınız.
		 */
		
     
		System.out.println();
		
		Scanner scan1=new Scanner(System.in);
		
		System.out.println("lutfen bir tamsayi giriniz ");
		
		int num3=scan1.nextInt();
		
	
		System.out.println("bitis tamsayisini giriniz");
		
		int num4=scan1.nextInt();
		
		while(num3<num4 ) {
			
			if (num3%2==0) {
				System.out.print(num3+" ");
				}
			num3++;
		}
		
		
        System.out.println();
		
		Scanner scan2=new Scanner(System.in);
		
		System.out.println("lutfen bir tamsayi giriniz ");
		
		int say=scan2.nextInt();
		
        System.out.println("bitis tamsayisini giriniz");
		
		int say1=scan2.nextInt();
		
		int sum=0;
		
		while(say<say1) {
			
			sum=sum+say;
			
			say++;
			
		}System.out.println(sum+"toplam");
		
		
		// baslangic ve bitis  sayilarin carpimini ekrana  yazdirin 
		
		
		     System.out.println();
			
			Scanner scan3=new Scanner(System.in);
			
			System.out.println("lutfen bir tamsayi giriniz ");
			
			int zah=scan3.nextInt();
			
	        System.out.println("bitis tamsayisini giriniz");
			
			int zah1=scan3.nextInt();
			
			int product=1;
			
			while ( zah<zah1) {
				
				product=product*zah1;
				
				zah++;
				
			}System.out.println(product+" carpim sonucu ");
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
