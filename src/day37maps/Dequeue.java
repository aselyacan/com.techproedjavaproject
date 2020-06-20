package day37maps;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		/*Deque : Double Ended queue (iki uclu queue)
		 * quue larda ekleme  sona yapilir , silme bastan yapilir.
		 * Deque kullanirsaniz  eklemeyi  hem basa hem de sona  yapabilirsiniz 
		 * 
		 * ayni  sekilde silmeyi de hem bastan hem de sondan yapabilirisiniz 
		 * 
		 * Deque de  FIFO VAR, BUNUN YANINDA  LIFO DA VAR ( last in First out ) da var 
		 * 
		 * Deque  resizable  dir.. yani  kapasitesi degistirilebilir 
		 Queule,lara elaman olarak null eklenebilir , ama  Deque lara  null eleman olarak eklenemez 
		 */
		
		Deque<String> dq=new LinkedList<String>();
		dq.add("Son1");// en sona eklar 
		dq.addFirst("Bas1");
		dq.addLast("Son2");// en sona ekler 
		dq.push("Bas2");// push() en basa ekleme yapar 
		dq.offer("son3");
		dq.offerFirst("Bas3");
		dq.offerLast("Son4");
		System.out.println(dq);// [Bas3, Bas2, Bas1, Son1, Son2, son3, Son4]
		
		
		// pop () methodu Deque larda bastaki elemani siler  ve bastaki   elemani return eder 
		
		System.out.println(dq.pop());// Bas3  silinir ve silinen elemani gosterir 
		System.out.println(dq);// [ Bas2, Bas1, Son1, Son2, son3, Son4]
		
		System.out.println(dq.removeLast());//Son4 silindi en sonda ki silinen elemani once gosterir 
		System.out.println(dq);//[ Bas2, Bas1, Son1, Son2, son3,]
		
		System.out.println(dq.removeFirst());// Bas2 silinir ve onu yazdirir
		System.out.println(dq);//   Bas1, Son1, Son2, son3  seklinde  yazilir  ...  ilk  bastaki silinince  
		
		
	}

}
