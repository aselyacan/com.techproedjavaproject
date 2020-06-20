package day06;

import java.util.Scanner;

public class IfElseStatemenödev1 {

	public static void main(String[] args) {
		/* Bir kisi  18 yasinin altinda ise evlenemez
		 * 45 yasin altinda ise evlenebilir ve cocuk sahibi olabilir
		 * 65 yasin ustunde ise emekli yazdirin 
		 */
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Lutfen yasinizi giriniz");
	
	int age=scan.nextInt();
	

	if (age<18 ) {
		System.out.println("Evlenemez");
	}
	else if (age>18) {
		System.out.println("EVLENEBILIR VE COCUK SAHIBI OLABILIR");
	}
	else {
		System.out.println("EMEKLI");
	}

	}

}
