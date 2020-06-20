package day26encapsulation;

public class Dog extends Mammal{
    
	
	public boolean sadik=true ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Dog dog=new Dog();
		System.out.println("Animal Class dan geldi :"+dog.age);// 0 gledi 
		System.out.println("Animal Class dan geldi :"+dog.name);// null 
		dog.eat();// yemek yer 
		dog.move();// hareket edebilir 
		System.out.println("Mammal Class dan geldi :"+dog.dogum);// true 
		dog.feed();// cocuklarini besler 
		System.out.println("Dog Class dan geldi :"+dog.sadik);// true
		
		dog.bark();
		
	}

	public void bark() {
		System.out.println("kopek havlar");
	}
}
