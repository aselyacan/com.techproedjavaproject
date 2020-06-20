package day22arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02ToArray {

	public static void main(String[] args) {
		/*
		 * toArray()  array e demek list i  bir array e  cevirmek  methodu  
		 * 
		 */
 
        List<String>  list= new ArrayList<>();
        
		 list.add("Ali");
		 list.add("Can");
		 
		 System.out.println(list);
		 
		 //1.yontem : toArray() methdunun icinde  parametre  olarak new String[0] kullaniniz
		 
		String arr[]=list.toArray(new String[0]);// bu birinci yol ve String icinde  her zaman 0 olur 
		
		System.out.println(Arrays.toString(arr));
		 
		// ikinci  yontem  : Olusturdugumuz  array in data type nin Object  olarak  secin 
		
		//Object  her class in babasi Object tir 
		
		// Object Class , Java da  butun class larin  babasidir.Yani  Object class ortak atadir 
		
		// Object Class, Java da parenti olmayan tek class dir 
		// String yerine Obect kullaniriz 
		
		  Object  arr1[]=list.toArray();
	      System.out.println(Arrays.toString(arr1));
	      
	      
	      // asList() methodu  array leri  list e cevirmek icin kullanilir 
	      //asList() methodu parametre olarak  array in ismini kabul eder 
	      
	      // Array den Liste  cevirme yaptiginizda , elde ettiginiz  list uzunluk olarak esnek degildir 
	      
	      //  Array den olusturdugunuz liste  ekleme ve cikarma  yapamazsiniz 
	      
	      String arr2[]= {"Aliye","Canan"};
	     // Arrays.asList(arr2);
	      List<String> list1=Arrays.asList(arr2);// [Aliye ,Canan]
//	      list1.add("Emine");// hata  verir 
//	      
//	      System.out.println(list1);
//		list1.remove("Aliye"); // remove de  hata  verir  liste cevirilen array  in boyutunda  eksilme ve arttirma yapilmaz 
		
		System.out.println(list);
		
		list1.set(0, "Kemal");// set methodu  calisir
		
		System.out.println(list1);
		
		String arr4[]={ "Python", "JAVA", "PHP", "Perl", "C#", "C++" };
	    
	   List<String> list2=Arrays.asList(arr4);
	    System.out.println(list2);
		 
	}

}
