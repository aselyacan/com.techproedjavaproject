package day33interface;

public interface IcAraba {

	int price=2000;// mavi olmasi final olmasindandir 
	
	boolean old=true; 
	
	public abstract void direksiyon();
	
	public void koltuk();
	
	abstract void klima();
	public default void doseme() { //  default kullanilinca  interface body li medotdu kabul eder 
		                           // default keyword unu yazarsak body eklemek zorundayiz aksi takdirde  Compile Time error alirizi
		System.out.println("Interface de default keyword ile doseme  concret methodu olusturdum ");
	}
	public static  void isitma() {
		System.out.println("static keyword ile de  concret method interface de olusuru  ama  genelde kullanilmaz ");
		
	} 
}
