package day16Overloading;

public class Constructor02 {

	public static void main(String[] args) {
		
		
		
		Constructor01 hondaAraba01=new Constructor01();
	System.out.println(	"Zamli Fiyat"+(hondaAraba01.price+10000));
	System.out.println(	"Year"+(hondaAraba01.year-1));
	System.out.println(	"Make"+hondaAraba01.make.replace("Honda","Toyota"));
	System.out.println(	"Type"+hondaAraba01.type.replace("Civic","Camry"));
	
	Constructor01 hondaAraba02=new Constructor01();
	System.out.println("Zamli Fiyat"+(hondaAraba02.price));/////,3,));
	
	
		

	}

}
