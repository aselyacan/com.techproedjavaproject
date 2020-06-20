package day19arrays;

public class Test4 {

	public static void main(String[] args) {
		/*
		 *  Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol
            eden bir program yazınız.Aynı eleman varsa “Aynı eleman var” yoksa
                     “Aynı eleman yok” yazdırınız.
		 */
		
		int arr[]= {2,6,8,2,9,10,2};
		
		int count=0;
		
		for (int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i]==arr[j]) {
					count++;
					System.out.println(arr[i]+"sayisinda eslesme saglandi");
				}
			}
			
		}
		if (count>0) {
			System.out.println(count+"eslesme saglandi");
		}else {
			System.out.println("esleme  gerceklesmedi ");
		}

	}

}
