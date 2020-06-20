package Java_Review_Turkisch;

import java.util.Scanner;

public class day03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="harun";
		
		System.out.println(str.substring(0,3));
		
		System.out.println(str.substring(4));
		
		System.out.println(str.substring(str.length()-1));
		
		
		//
		
		Scanner sc= new Scanner(System.in);
        String ad,soyAd,rapor;
        int d_yıl,b_yıl;
        
        System.out.println("Lütfen Adınızı Giriniz:");
        ad= sc.nextLine();
        System.out.println("Lütfen Soyadınızı Giriniz");
        soyAd= sc.nextLine();
        System.out.println("Lütfen Doğum yılınızı giriniz");
        d_yıl= sc.nextInt();
        System.out.println("Lütfen şimdiki yılı giriniz");
        b_yıl= sc.nextInt();
        int yas=(b_yıl-d_yıl);
        rapor="Adınız: "+ad+ " Soyadınız: "+soyAd+" Yaşınız: "+yas;
        
        System.out.println(rapor);
        String sifre=yas+ad.substring(0,1)+soyAd.charAt(0)
        +soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
        System.out.println("Şifreniz: "+sifre);
		
		
	}

}
