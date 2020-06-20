package day33interface;

public class BasicHonda extends Araba implements IcAraba, DisAraba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Class==> Interface:implements 
		//Class==> Class:extends 
		
		//	Farklı Interface’lerde aynı isimde farklı Return type’lerdeki metodlar yazılırsa Compile Time Error verir.
		// Farklı Interface’lerde aynı isim ve aynı Return type’lerdeki metodlar olursa implements durumunda
        //sorun olmaz
        //Farklı Interface’lerde Variable’lar için data type ve isimler aynı ama değerler farklı ise
         //implements durumunda bu variable’lara Interface isimleri ile ulaşabiliriz.
		
		BasicHonda temelHonda=new BasicHonda();
		
		temelHonda.diesel();
		temelHonda.direksiyon();
		temelHonda.kapi();
		temelHonda.klima();
		temelHonda.koltuk();
		temelHonda.move();
	}

	@Override
	public void kapi() {
		// TODO Auto-generated method stub
		System.out.println("Manuel Kapi eski usul ");
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		System.out.println("elektronik ama suni derili direksiyon");
	}

	@Override
	public void koltuk() {
		// TODO Auto-generated method stub
		System.out.println("ëski surum deri olmayan argonamik koltuk alltan isitmali");
	}

	@Override
	public void klima() {
		// TODO Auto-generated method stub
		System.out.println("surum 2  manual  klima ");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("10 saniyede 100 km hiza ulasir ");
	}

}
