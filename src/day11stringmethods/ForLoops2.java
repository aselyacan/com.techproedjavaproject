package day11stringmethods;

public class ForLoops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		          // 100  den kucuk 3 un kati olan sayma sayilarini  ekrana  yan yana yazdiran for loop  olusturunuz
		
		
		for (int i=3; i<100; i+=3  ) {
			
			System.out.print(i+" ");
		}
		
		// ilk  5  sayma sayisinin   toplamini veren programmi  for loop ile yaziniz
		
		// 1 2 3 4 5 
		
		// int sum=0;  0+1=1, 1+2=3, 3+3=6, 4+6=10, 5+10=15,
		
		
		// int sum=0 toplama isleminde her zaman  kullanilmali 
		
		//System.out.println();  curle brase  disine koyariz  tek toplamin cevabini almak icin aksi takdirde her etabin top cevabini aliriy
		
		System.out.println();
		
		int sum=0;
		
		for (int i=1; i<6; i++) {
		sum=sum+i;
	   }
	
	System.out.print("Toplam"+sum);
	
	// 10  dan buyuk  ilk uc  sayma sayisinin  toplamanini vere for loop  yaziniz\
	
	     System.out.println();
	    int sum1=0;
	
	for (int i=11; i<14; i++) {
		sum1=sum1+i;
	}
	
	System.out.println("Toplam"+":"+sum1);
	
	
	
	
	
	
	// 20 den  buyuk  ilk bes sayma  sayisinin  toplamini  vere  for loop vere program yaziniz
	
	
	int sum3=0;
	
	for (int i=21; i<26; i++  ) {
		
		sum3=sum3+i;
	}
	
	System.out.println("toplam"+sum3);
	
	
	
	// ilk 50  sayma sayisinin  toplamini veren for loop olusturunuz
	
	
	int sum4=0;
	
	for (int i=1; i<51; i++) {
		sum4=sum4+i;
	}
	System.out.println(sum4+"topalam");
	
	
	// 5 ile  bolunen bile ve 100 den kucuk sayma sayilarinin toplamini veren for loop olusturunuz
	
	int sum5=0;
	
	for (int i=5;   i<100; i=i+5) {
		
		sum5=sum5+i;
		
	}
	
	System.out.println(sum5+"toplam");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
}
