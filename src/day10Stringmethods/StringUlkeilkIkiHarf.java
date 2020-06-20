package day10Stringmethods;

import java.util.Scanner;

public class StringUlkeilkIkiHarf {

	public static void main(String[] args) {
		//Kullanicidan Yasagidi ulke adini alin ve Ilk iki Harfini buyuk olarak  yazidirin
		
		
		Scanner scan=new Scanner(System.in);
		
		String land=scan.nextLine();
		land=land.toUpperCase();
		
		
		System.out.println(land.substring(0,2)); 
		
		

	}

}
