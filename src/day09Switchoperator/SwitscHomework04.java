package day09Switchoperator;

import java.util.Scanner;

public class SwitscHomework04 {

	public static void main(String[] args) {
		/*
		 * 
		 * Kullanıcıdan ay ismi alın eğer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
             Eğer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
                Eğer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
                    Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		 */

		Scanner scan=new Scanner(System.in);
		
		
	System.out.println("Lutfen bir ay  ismi giriniz");
		
		String ay=scan.next();
				
				ay=ay.toUpperCase();
				
				switch (ay) {
				
				case "Haziran":
					System.out.println("bu 31 ceken bir ay");
				break;
				case "Temmuz":
					System.out.println("bu 31 ceken bir ay");
				break;
				case "agostos":
					System.out.println("bu 31 ceken bir ay");
				break;
				case "ocak":
					System.out.println("bu 30 ceken bir ay");
				break;
				case "subat":
					System.out.println("bu 29 ceken bir ay");
				break;
				default:
					System.out.println("gecersiz bir ay ismi");
				}
				
	}

}
