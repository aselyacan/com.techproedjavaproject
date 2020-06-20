package day10Stringmethods;

import java.util.Scanner;

public class SwitschOdevsoruruAY01 {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
             Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
              Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
                Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		
		
		String ay=scan.next();
		ay=ay.toLowerCase();
		switch(ay) {
		case "Ocak":
		 System.out.println("Bu  ay 31  gundur ");
		break;
		case "Subat":
			 System.out.println("Bu  ay 28 ve 29  gundur ");
			break;
		case "Mart":
			 System.out.println("Bu  ay 31  gundur ");
			break;
			 
		case "Nisan":
			 System.out.println("Bu  ay 31  gundur ");
			break;
		case "Mayis":
			 System.out.println("Bu  ay 31  gundur ");
			break;
			 
		case "Haziran":
			 System.out.println("Bu  ay 31  gundur ");
			break;
			 
		case "Temmuz":
			 System.out.println("Bu  ay 31  gundur ");
			break;
		case "Agustos":
			 System.out.println("Bu  ay 31  gundur ");
			break;
			default :
				System.out.println("boyle bir ay yok ");
			 
			 
		}
		
		
	}

}
