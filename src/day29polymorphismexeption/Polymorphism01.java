package day29polymorphismexeption;

public class Polymorphism01 {

	public static void main(String[] args) {
		// Polymorphism  ===> coklu yapi  demektir  yada overloading yada overriding ile  yapilir
		// Polymorphism i overloading  ile yaparsaniz  " Compile  Time Polymorphism " denir 
		// diger adi  Static polymophism dir 
		// Polymorphism'i Overloading ile yaparsaniz "Compile Time Polymorphism" denir.
		//                Diger adi static polymorphim'dir.
		// Polymorphism'i Overriding ile yaparsaniz "Run Time Polymorphism" denir.
		
	}
	public void eat() {
		System.out.println("Ye!");
	}

	//overloading ile polimorphism
	
	public void eat(String name ) {
		System.out.println(name+"Ye!");
	}
	class Yeni extends Polymorphism01{// yeni bir class olusturuldu 
		// overriding ile polymorphism 
		public void eat() {
			System.out.println("Lutfe Ye!");
		}
	}
}
