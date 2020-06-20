package day36collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		/*Queue : Queue ya eklenen elamnlar en sona eklenir , listler de  oldugu gibi 
		 *        Queue da silinen elemanlar en bastan silinir 
		 *        [1,2,3] ====> Bu queue  dan eleaman silmeye baslandiginda once 1 silinir ..
		 *        FIFO DENIR  FIRST IN FIRST OUT  DENIR , ILK GELEN EKMEGI ONCE BITIRIRLER , ILK GIREN ILK CIKAR 
		 * 
		 */
		//  PriorityQueue  elemanlari  natural order a gore  siralar  .. siraya gore 
		Queue<String> q=new PriorityQueue<>();  //   Queue ile  olmaz cunku  Interface dir  
		
		q.add("B");
		q.add("A");
		q.add("C");
	//	q.add("D");
		
		System.out.println(q+"  priority  queue  ekleme  sirasina gore dizer");//[A,B,C,D]
		// remove() methodu  kullanalim ,  sildigi elemani  return eder ..
		//  REMOVE  mETHODU  EXCEPTION VERIDIGINDEN BU KODU COMMENT YAPTIK 
		System.out.println(q.remove());// remove()  sildigi  elemani  return eder //[B,C]  kalir 
		System.out.println("Kalan queue"+q);// [B,D,C] 
		
		System.out.println(q.remove("C"));// True  verir  sildinigi onaylar cunku biz Java ya hangi elemani silmesi gerektigini soyledik 
		
		System.out.println(q);// [B,D]   
		
		// LinkedList ise  kullaninicin girdigi siraya  gore  dizer ...
		Queue<String> qll=new LinkedList<>();
		qll.add("B");
		qll.add("A");
		qll.add("C");
		//qll.add("D");
		
		System.out.println(qll);// [B,A,C,D] LinkedlIST  BIZIM GIRDIGIMIZ  SIRAYA GORE YAZDIRIR..
		
		System.out.println("Ilk elemani :"+qll.element());// ilk elemani dondurur
		System.out.println(qll.poll());// B ==> ilk elemani sildi ve return etti 
		System.out.println(qll);
		System.out.println(qll.poll());// A
		System.out.println(qll);
		System.out.println(qll.poll());//C
		System.out.println(qll);//[]
	    System.out.println("Bos Queue icin poll (): "+qll.poll());
	    
	        //Not: remove() methodu bos queue'lar icin kullanilirsa Exception verir.
	  		//     poll() methodu bos queue'lar icin kullanilirsa null verir.
	  		//     Ama dolu queue'lar icin ayni isi yaparlar, farklari yoktur	
	    
	    
	}

}
