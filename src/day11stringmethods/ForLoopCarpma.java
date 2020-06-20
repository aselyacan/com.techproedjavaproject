package day11stringmethods;

public class ForLoopCarpma {

	public static void main(String[] args) {
		// 
		
		
		// ilk dort  sayma sayisinin carpimini  veren  for loop  olusturunuz
		
		// 1 2 3 4   ===>24 
		
		int product=1;
		
		for (int i=1; i<5; i++) {
			
			product=product*i;
		}
		
		System.out.println(product+"carpma sonucu ");
		
		//  ilk 10 cift  sayma sayisinin carpimini veren for loop  olusturun
		System.out.println();
		
		int product1=1;
		
		for (int i=2; i<21; i=i+2) {
			product1=product1*i;
		}
		
		System.out.println(product1+"sonuc");
		
		
		// matematikte  birer birer  geri sayim  yapip  carmaya  faktoryel denir 
		
		// 6!=6*5*4*3*2*1
		
		// interviewler sorarlar 
		
		// 9! faktoryeli  hesaplayan programi for loop kullanarak  yaziniz 
		
		
		int product2=1;
		
		for (int i=9; i>0; i--) {
			product2=product2*i;
		}
		System.out.println("9!"+product2);
	}
	
	
	

}
