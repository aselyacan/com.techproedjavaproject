package day38interviewHazirlik01;

public class PassByValuePassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// bir methoda  variable yollandiginda  , java  o variable  nin kopyaisini  olusturur ve methoda  kopyayi  yollar 
		// bu yuzden  variable in  orjinal degeri method calistiktan sonra da ayni kalir 
		// Buna  Pass By Value denir .   
		// Pass By Reference  asil  variable in yada orginal  olanin steak memory deki referance nin degismesi anlaminda gelir ama java bunu kullanmaz 
		// Pass By Reference da ise  reference in kopyasini  olusturulur ve methoda yollanilir 
		//fakat reference'in kopyasi da kendisi gibi ayni object'i gosterdigi icin orjinal
		//deger degisir.

		
		int x= 12;
		 System.out.println(increment(x));//13
		 System.out.println(x);// 12  

	}

	public static int increment(int a) {
		a=a+1;
		return a;
	}
}
