package day22arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		//9.Method  equals 
		
		// equals() metodu  iki listin  birbirine  esit  olup olmadigini  kontrol eder 
		// List ler esit is true   degilse false  return eder 
		
		// equals() medhtodu  adreslere yada refenrencelere  bakmaz  sadece  elamanlarin ayni  olup olmadigina bakar
		// equals() method undan true alabilmek icin hem referencler hemde elamanlar ve sayilar ayni olmali 
		
		List<String> list1=new ArrayList<>();
		
		List<String> list2=new ArrayList<>();
		
		System.out.println(list1.equals(list2));// true  verdi 
		
		list1.add("A");
		list1.add("B");
		System.out.println(list1.equals(list2));// false cunku
		
		list2.add("B");
		list2.add("A");
		System.out.println(list1.equals(list2));// false   cunku  elamanlarin siralari ayni degil 
		
		
		
	}

}
