package day26encapsulation;

public class Cat extends Mammal {

	public boolean clean=true;
	public static void main(String[] args) {
		
		
		Cat cat=new Cat();
		System.out.println("kedinin yasi"+cat.age);
		System.out.println("dogum yapar"+cat.dogum);
		System.out.println("kedi temizdir"+cat.clean);
		System.out.println("kedinin adi var: "+cat.name);
		cat.eat();
		cat.feed();
		
		

	}

	public void  meow() {
		System.out.println("kediler miyavlar");
	}
	
	
	// kardesler arasinda  Inhetance olmaz 
}
