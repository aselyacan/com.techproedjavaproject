package day27constructorcagirma;

public class Dog extends Mammal {
	public boolean sadik = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Dog dog=new Dog();
		
		
	}
	public void bark() {
		System.out.println("Kopekler havlar");
	}
	Dog(){
		System.out.println("Dog parametresiz constructor");
	}
	
	

}
