package javaDersiPratikleriCumartersi;

public class InterviewSorusuSayiDegistirme {

	public static void main(String[] args) {
		
		int num1=23;
		
		int num2=31;
		
		int gecici=0;
		
		gecici=num1;
		num1=num2;
		num2=gecici;
		
		
		System.out.println("degismeden onceki halleri 23 ve 31 ");
		System.out.println(num1);
		System.out.println(num2);
		
		
		
		int say1=9;
		
		int say2=17;
		
		System.out.println("Degismeden Onceki Halleri");
		System.out.println("say1 "+say1);
		System.out.println("say2 "+say2);
		
		
		say1=say1+say2;
		
		say2=say1-say2;
		
		say1=say1-say2;
		
		System.out.println("Degismeden Sonraki Halleri");
		System.out.println("say1 "+say1);
		System.out.println("say2 "+say2);
		
		
		

	}

}
