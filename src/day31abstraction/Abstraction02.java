package day31abstraction;

public class Abstraction02 extends Abstraction01{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Abstraction02 obj=new Abstraction02();
		
		obj.abstractMethod();
		obj.concretMethod();
		
	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract methodun ovveride edilmis hali ");
	}

	//public  abstract void  abstractMethod();
}
