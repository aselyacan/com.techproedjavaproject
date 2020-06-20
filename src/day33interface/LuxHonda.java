package day33interface;

public class LuxHonda extends Araba implements IcAraba,DisAraba{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			LuxHonda luxHonda = new LuxHonda();
			luxHonda.benzin();
			luxHonda.direksiyon();
			luxHonda.kapi();
			luxHonda.klima();
			luxHonda.koltuk();
			luxHonda.move();
			luxHonda.doseme();
		//	luxHonda.isitma();
            System.out.println("ic araba interface den price :"+IcAraba.price);//  once interface deki class adini  cagirmali  int degerini tesbit etmek icin
            System.out.println("Dis araba interface den price :"+DisAraba.price);
            System.out.println(old);//  sikayet  olmaz cunku old  degeri    bir tane  oldugundan java sikayet yok  
			
	}

	@Override
	public void kapi() {
		// TODO Auto-generated method stub
	
		System.out.println("dokunmakit ve sese ve yuz tanimaya duyarli arti zirhli ");
	}

	@Override
	public void direksiyon() {
		// TODO Auto-generated method stub
		System.out.println("ucak kokpit modullu smart  argonamik  ios tabanli");
	}

	@Override
	public void koltuk() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void klima() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
