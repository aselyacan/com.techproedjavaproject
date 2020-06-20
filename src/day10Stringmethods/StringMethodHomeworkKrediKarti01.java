package day10Stringmethods;

import java.util.Scanner;

public class StringMethodHomeworkKrediKarti01 {

	public static void main(String[] args) {
		
		/*
		 *   Kullanıcıdan kredi kartı numarasını alın ve bu numaranın üçüncü, dördüncü ve sonuncu  rakamlarını ekrana yazdırın
		 * 
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen kredi karti numaranizi  giriniz");
		
		String str1=scan.nextLine();
		
		System.out.println("kartin ucuncu rakami"+str1.charAt(2));
		
		System.out.println("kartin dorduncu rakami"+str1.charAt(3));
		
		System.out.println("kartin ucuncu rakami"+str1.charAt(str1.length()-1));
		

	}

}
