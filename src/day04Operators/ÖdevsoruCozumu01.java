package day04Operators;

import java.util.Scanner;

public class ÖdevsoruCozumu01 {

	public static void main(String[] args) {
		
    //Kullanicidan Integer aldiktan sonra String alamiyoruz.
        
        Scanner scan = new Scanner(System.in);
        
        //Java'da nextInt() kullandiktan sonra nextLine() kullanirsak kod calismiyor.
        //nextInt() yerine nextLine() kullan sonra elde ettigin String'i
        //Integer.parseInt()kullanarak integer'a cevir.
        
        System.out.println("Yasinizi giriniz");
        String yas = scan.nextLine();
        int yeniYas = Integer.parseInt(yas);//String;i tamsayiya cevirme metodu
                                            //Integer.parseInt() sadece rakam iceren Stringler icin calisir.
        System.out.println(yeniYas + 1); //34
        
        System.out.println("Adinizi ve soyadinizi giriniz");
        String isim = scan.nextLine();  
        System.out.println(isim);
        
        Scanner scann=new Scanner(System.in);
        System.out.println("Lutfen Notunuzu giriniz");
        String not=scan.nextLine();
        int    point=Integer.parseInt(not);
        System.out.println(point);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
