package day26encapsulation;

// Inheritance 01, Inheritance02 nin parenti olacak 

public class Inheritance02 extends Inheritance01 {// sagdaki  parent  extends  den sonraki parent , onceki  child oldu 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Child in  birden fazla parent mi olur mu?
		/* Cevap : olmaz... java Multiple  Inheritance si desteklemez  
		 * Java  single Inheritance destekler 
		 * Parent in birden fazla  Child i olurmu ?
		 * 
		 * Cevap  : olur  "hiyerarsik  Inheritance denir"
		 * 
		 * child[a,b]-------> parent[c,d,e]-----> grandParent[f,g]
		 * 
		 * Child nelere sahip ===> a,b,c,d,e,f,g  cok  funktional dir 
		 * Parent nelere sahip ====> c,d,e,f,g
		 * GrandParent nelere sahip ====> f,g  ve hic  de funktionel degil 
		 */
		

	}

}
