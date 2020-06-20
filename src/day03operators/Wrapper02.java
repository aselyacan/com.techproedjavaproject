package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
	
		
		//kullanicidan ilk ismini alin ekrana yazdirin.
		
		//kullacidan soy  isimini alin ekrana ilk isminin altina yazdirin .
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ");
		String isim=scan.nextLine();
		System.out.println(isim);
		
        System.out.println("soy adinizi giriniz");
		String soy=scan.next();
		System.out.println(soy);
		
		
		
		//Kullanicidan ad ve soyadini alalim ekrana yazdiralim
		//Kullanicidan adresini alalim ekrana yazdiralim (2. cadde Bakirkoy Istanbul Turkiye)
		//Kullanicidan yasini alalim ekrana yazdiralim.
		//Kullaniciya "Turkiye'de yasiyorum. true/false" diye soralim cevabini ekrana yazdiralim
		//true veya false olarak
				
				
				System.out.println("Ad ve soyadinizi giriniz");
				String tamIsim = scan.nextLine();
				System.out.println(tamIsim);
				
				System.out.println("Adresinizi giriniz");
				String adres = scan.nextLine();
				System.out.println(adres);
				
				System.out.println("Yasinizi giriniz");
				int yas = scan.nextInt();
				System.out.println(yas);
				
				System.out.println("Turkiye'de yasiyorum. true/false");
				boolean blTr = scan.nextBoolean();
				System.out.println(blTr);
		      
				
				System.out.println("Almanyda  yasiyorum");
		        boolean al=scan.hasNext();
		        System.out.println(al);
		
		
		
	}

}
