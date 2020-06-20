package day19arrays;

public class Arrays03 {

	public static void main(String[] args) {
		//elemanlari 1 2 3 4 5 olan bir integer arrat olusturunuz
		// bu array da 3 elemaninin olup olmadigini  kontrol ediniz
		// 3 varsa ekrana 3 var yazdririn
		// 3 yoksa  ekrana  3 yok yazdirin
		
		
		
//		int arr[]=new int[5]; // arrar olusturup  eleman eklemek icin birinci yol
//		
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
		
		//  array  olusturup eleman  eklemenin 2. yolu ve kisa yolu 
		
		int arr[]= {3,2,3,3,5};
		
		int count=0; //  buna flag denir bayrak denir 
		
		for (int i=0; i<5; i++) {
//			if (arr[i]==3) {
//				System.out.println("3 var ");bu  method  daha uzun her defasinda var yok yazdirir 
//			}else {
//				System.out.println("3 yok ");
//			}
			if (arr[i]==3) {
				count++;
			}
		}
		if (count>0) {
			System.out.println(count+"tane 3 var ");
		}else {
			System.out.println("3 yok ");
		}
		
		
	}

}
