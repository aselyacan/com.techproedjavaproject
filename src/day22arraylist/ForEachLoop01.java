package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		//For Each Loop un ust versiyonudur
		// Diger adi "Enhanced zenginlestirilmis" For Loop 
		
		
		
		int arr[]= {12,21,13,43};
		
		
		//for loop kullanarak  elamanlari ekrana yazdir 
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		// for each loop  kullanarak  elemanlari  ekrana yazin
		System.out.println("for each den sonraki  durum");
		for (int w:arr) {
			System.out.println(w);
		}
		
		// String iceren bir array olusturun ve elemanlarini  yan yana  aralarina bosluk  koyarak 
		// for each loop ile  ekrana yazdirin
		
		String arr1[]= {"ali","can","ben"};
		
		for (String w:arr1) {
			System.out.print(w+" ");
		}
		
		// Integer elemanlar iceren bir list  olusturun .For each loop kullanarak bu elamanlarin toplamini ekrana yazdirin
		
		List<Integer> list1=new ArrayList<>();
		
		list1.add(10);
		list1.add(11);
		list1.add(12);
		int sum=0;
		
		for (int w:list1) {
			sum=sum+w;
			
			System.out.println(sum);
		}	
			// {{1,2},{5},{6,7,8}} array in deki  tum elemanlarin toplamini bulunuz 
		    
			
			System.out.println();
			int arr2[][]={{1,2},{5},{6,7,18}};
			int sum1=0;
			
			for (int[] w: arr2){
				
				for (int  z:w) {
					sum1=sum1+z;
				}
				
			}
			System.out.println(sum1);
		
		
	}

}
