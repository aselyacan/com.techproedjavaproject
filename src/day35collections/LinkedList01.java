package day35collections;

import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// Linked list olusturunuz 
		
		
		LinkedList<String>  linkList=new LinkedList<>();
		
		linkList.add("Mark");
		linkList.add("Amanda");
		linkList.add("John");
		linkList.add("Ann");
		linkList.add("Pamela");
		
		
		// LinkList i  ekleme  ve  cikarmayi cok yaptigimiz  zaman linklist  kullanilir 
		
		
		System.out.println(linkList+"listler  syso icine  konulrak yazdirlir  ekle mede add ile olur ");

        linkList.remove(2); // index e gore elaman siler  linkList i bu methodu var 
        
        System.out.println(linkList);//  john  siliniecek  cunku ikinci  index de 
		
        linkList.removeFirst();
        System.out.println(linkList+" :Mark ismi silinicek ilk eleman cunku ");//[amanda , ann, pamela ]
        
        linkList.removeLast();// Pamela  silinecek cunku last elamandir 
        System.out.println(linkList);//[amanda ,ann]
     
        linkList.add(1, "Ali");
        System.out.println(linkList);//[amanda , ali, ann ] seklinde olur  cunku  add ile  indexe ekleem oldu 
        
        linkList.addFirst("Kemal");// [kemal , amanda , ali,ann]  seklinde olur  0 ci  indexe  kemal eklendi 
        
        System.out.println(linkList);
        
        linkList.addLast("Zeynep");
        System.out.println(linkList);//[kemal , amanda , ali , ann , zeynep] seklinde olur ein son  elamana ekleme olur 
        
        linkList.set(1, "Ajanda");
        System.out.println(linkList);//[ kemal , ajada, ali , ann , zeynep]  seklinde olur set ile degistirme oldu 
        
        ////////////////////
        LinkedList<String> linkList2=new LinkedList<>();
        linkList2.add("x");
        linkList2.add("y");
        
        linkList2.addAll(linkList);
        
        System.out.println(linkList2);// [x,y,kemal,ajanda ,ali,ann,zeynep] seklinde  ilk  linklist de ilave oldu ikinci linklist1 ye 
        
        linkList.addAll(3,linkList2);
        System.out.println(linkList);
        // [kemal,ajanda,ali,x,y,kemal,ali, ann, zeynep,ann,zeynep] seklinde olur  ilk  linklist in 3 cu  indexine  linkList2 yi eklendi 
        
        System.out.println(linkList.contains("Can"));//  can ismi  var mi yok mu diye boolean sonucu verir  false verir
        System.out.println(linkList.contains("Ali"));//  Ali ismi var mi yok mu die bakar  ve true verir 
        
        linkList2.clear(); //   clear()  listin  elemanlarini siler  ve bos bir list kalir  kalibin icindeki elemanlari silmek icin yada icini bosaltmak icn  butun yapiyi ortadan kaldirmiyor 
        
        System.out.println(linkList2);//  artik linkList2 de eleaman kalmaz  bosalir 
        
		
	}

}
