package day32abstraction;

public interface Interface01 {

	// Interface icine  concret method  yani curly brase  method  konulmaz  abstarct olmali //  Java 13 den sonra concret  method da yazilabilir ama static ve defaul  ile olmali 
	// O zaman Compile Time Erorr verir
	// Interface  de method  olusturuken kesinlikle  body yazmayin 
	//  Interface de ki methodlar kesinlikle  abstract olmalidir 
    // Interface de  ki abract  method lari uretirken abstract keyword  kullanilsada olur kullanilmasada olur 
	// cunku interface kendi icine yazilan methodlar  abstrackt olarak kabul eder 
	//  interface ve abstraclar bir birine  extends ile child parent olabilir ....  interface to interface extends olur 
	// abstract to abstract   extends olur 
	
	
	public void add();
 	
	public abstract void subtract();
	
	// interface da ki  variabler  mutlaka  public static  final ve intialize  yani deger atanmis sekilde olmali
	public static final int a=12;
	
	
	
	// variable olusturulurken public  static final keywordlari kullanisalda  olur , kullanilmasada olur 
	int b= 11; 
	public int c=13;
	final int d=14;
	static int e=15;
	//  seklinde de yazilabilir  ve  java onu sanki  varmis gibi kabul eder 
	
}
