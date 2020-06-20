package Java_Review_Turkisch;

public class InterviewSayidegistirmeSorusu01 {

	public static void main(String[] args) {
		// Verile iki sayinin yerlerini degisitiniz...
		
		
 //		birin yontem 
//		int num1=5;
//		
//		int num2=3;
//		
//		int gec=0;
//		
//		gec=num2;
//		num2=num1;
//		System.out.println(gec);
//		
//		System.out.println(num2);
		 
		int  say1=6;
		int  say2=8;
		
		
		System.out.println("degisiklik olmadan once :"+say1+say2 );
		int  temp=say1; // gecici bir  ucuncu kap  olusturmak  gerekiyor ..
		// sonra da  temp  i  say2 nin icine  atacagiz
		
		
		
		say1=say2;
		
		say2=temp;
		
		
		System.out.println("degisiklik olduktan sonra: ");
		
		System.out.println(say1);
		System.out.println(say2);
	}

}
