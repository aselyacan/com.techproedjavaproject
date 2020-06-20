package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Review2 {

	public static void main(String[] args) {

 /*
  *  // asList() methodu  array leri  list e cevirmek icin kullanilir 
	      //asList() methodu parametre olarak  array in ismini kabul eder 
	      

  */
		
		String arr[]= {"iskender","can","ayse","bugun"};
		
		
		List<String> list1=Arrays.asList(arr);
		
		System.out.println(list1);
		
		//for loop kullanarak  elamanlari ekrana yazdir 

		//String sum="";
		for (String w: list1) {
		//sum=sum+w;
			System.out.print(w+" ");	
		}
		
		
		System.out.println();
		// String iceren bir array olusturun ve elemanlarini  yan yana  aralarina bosluk  koyarak 
		// for each loop ile  ekrana yazdirin
		
	             String arr1[]= {"ali","can","ben"};
	             

	            for (String w:arr1) {
		       
	            	System.out.print(w+" ");
	    }System.out.println();
	    		// Integer elemanlar iceren bir list  olusturun .For each loop kullanarak bu elamanlarin toplamini ekrana yazdirin
	    		
	    		List<Integer> list2=new ArrayList<>();
	    		
	    		list2.add(10);
	    		list2.add(11);
	    		list2.add(12);
	    		int sum=0;
	    		
	    		for (int w:list2) {
	    			sum=sum+w;
	    			
	    		}System.out.print("toplam "+sum);
	    		
	    		/*For-each loop Soru 1:Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını 
	    		 * For-each loop kullanarak bulunuz. 
	    		 * Sonucu ekrana yazdırınız.
	    		 * 
	    		 */
	    		
	    		int arr3[]= {1,3,4,5,6,34,23,0};
	    		
	    		int product=1;
	    		
	    		for (int w:arr3) {
	    			
	    			product=product*w;
	    			
	    			System.out.println(product+" : carpim");
	    		}
   // 	 Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını 
	    		//For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız   		

	    		
	    		List<Integer> list3=new ArrayList<>();
	    		
	    		list3.add(2);
	    		list3.add(8);
	    		list3.add(21);
	    		list3.add(3);
	    		
	    		int sum1=0;
	    		
	    		for (int w:list3) {
	    			
	    			sum1=sum1+(w*w);
	    			
	    		}System.out.println(sum1+"karesinin toplami ");
	    		
	    		
	    		String arr4[]= {"ali","can","gel"};
	    		
	    		String arr5[]= {"evet","can","fatih"};
	    		int count=0;
	    		for (String w:arr4) {
	    			for (String k:arr5) {
	    				
	    				if (w==k) {
	    					System.out.println("ayni eleman "+w);
	    					
	    					count++;
	    				}
	    			}
	    		}if(count==0) {
    				System.out.println("ayni elaman degil ");
    			}
	    		
	}
	
}
