package day19arrays;

public class Arrays02 {

	public static void main(String[] args) {
		//4 elemanli char bir array olusurun ve bu array  e elemanlar  yerlestirin
		// tum elemanlari  for dongusu  kullanarak  ekrana yazdirin
		
		char arr1[]=new char[4];
		
		arr1[0]='a';
		arr1[1]='s';
		arr1[2]='l';
		arr1[3]='i';
		
		
		for(int i=0; i<4; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println(arr1[3]);
		
		// array in lenght i ni bulmak icin  "arrayin ismi sonra .lenght yazmak yerlidir
		// arr1.lenght seklinde 
		
		System.out.println(arr1.length);// array uzunlugu bulunabilir  4 dur 
		// Stringler de lenght medthodu  kullanilir ama  stringler de  lenght medthodu  parantezlidir 
		// lenght()  stringlerde bu sekilde 
		// array lerde ise  sadece lenght  parantezssiz sekilde 
		 
		
		// arrayler de son  elaman olan index yazdirmak icin length-1 formulu kullanilir string gibi
		
		System.out.println(arr1[arr1.length-1]);// son index i  yazdi
	}

}
