package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Review1 {

	public static void main(String[] args) {
		/*
		 * 
		//9.Method  equals 
		
		// equals() metodu  iki listin  birbirine  esit  olup olmadigini  kontrol eder 
		// List ler esit is true   degilse false  return eder 
		
		// equals() medhtodu  adreslere yada refenrencelere  bakmaz  sadece  elamanlarin ayni  olup olmadigina bakar
		// equals() method undan true alabilmek icin hem referencler hemde elamanlar ve sayilar ayni olmali 
		
		 */
		
		List<String> list1=new ArrayList<>();
		
		List<String> list2=new ArrayList<>();
		
		list1.add("can");
		
		list2.add("can");
		
		list1.remove(0);
		list2.remove(0);
		
		System.out.println(list1.equals(list2));
		
		list1.add("ali");
		list1.add("can");
		System.out.println(list1);
		
		
		String arr[]=list1.toArray(new String[0]);
		
		System.out.println("1 yontem "+Arrays.toString(arr));
		
		Object arr1[]=list1.toArray();
		
		System.out.println("object ile olan "+Arrays.toString(arr1));
		
		
		
	}

}
