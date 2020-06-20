package day36collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TreeSet 1 ) HashSet ile hemen hemen aynidir ..Dublicationa musaade etmez 
		// key-value yapisi kullainir
		//         2) TreeSet elemanlarini  natural order  a gore dizer ,  siraya gore dizer
		            // hashSet  ise  rastgele elemanalari  dizer 
		//         3)  HashSet  , TreeSet e gore daha hizlidr , cunku siralama gibi bir yavaslatici unsur yoktur 
          //		 4) Natural ORder a bir bir set lazim oldugunda HashSet olusturulur
	     //				sonra bu HashSet TreeSet e donusturulur boylelikle TreeSet in hiz p
	     //				problemi halledilir.
		
		TreeSet<String> tSet=new TreeSet<>();
		tSet.add("ABC");
		tSet.add("String");
		tSet.add("Test");
		tSet.add("Pen");
		tSet.add("Ink");
		tSet.add("Jack");
		System.out.println(tSet);  // [ABC,String,Test,Pen,Ink,Jack]
		
		// HashSet olusturup  javanin  elemalari  hizli  eklemesini saglariz 
		
		HashSet<String> hSet =new HashSet<>();
		hSet.add("ABC");
		hSet.add("String");
		hSet.add("Test");
		hSet.add("Pen");
		hSet.add("Ink");
		hSet.add("Jack");
		System.out.println(hSet);
		
		        //Olusturdugumuz HashSet'i TreeSet constructor'ina parametre olarak
				//koyup TreeSet'e ceviririz, boylelikle TreeSet'in elemanlari natural order
				//yapma ozelliginden istifade etmis oluruz. ve Hashset  in elemanlari  siralanmis olur 
		
				TreeSet<String> tSet1 = new TreeSet<>(hSet);
				System.out.println(tSet1);

		
		
	}

}
