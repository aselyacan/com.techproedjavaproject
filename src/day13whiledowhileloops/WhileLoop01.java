package day13whiledowhileloops;

public class WhileLoop01 {

	public static void main(String[] args ) {
		
		// while loop  kullanarak  ilk  5 sayma sayisinin  toplamini ekrana yazdiran bir program yapin
		
		
		int sum=0;
		
		int num=1;
		
		while (num<6) {
			
			
			sum=sum+num;
			
			num++;
				
		}
		System.out.println(sum); // 1+2+3+4+5=15
		
		// en son toplami gormek icin System.out.println(sum)  ifadesini  loop disina  yazin 
		
		// HER ADIMDAKI TOPLAM GORMEK ICIN SYSTEM.OUT U  LOOP UN ICINE YAZIN 
		
		
	}
	
	
}
