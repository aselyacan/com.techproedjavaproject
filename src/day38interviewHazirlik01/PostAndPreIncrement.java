package day38interviewHazirlik01;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Post increment   arttirma  sonra olur 
		int a =12;
		a=a++;
		
		// java soldan saga calisir 
		System.out.println(a);//12  olur  cunku once a yi atama yapar ve hep  12  degeri yazilir 
		
		a++; 
		System.out.println(a);//13  oldu 
		
		// Post increment olur 
		int b=22;
		
		b++;
		System.out.println(b);//23  artma olur soldan saga okuma dan dolayi
		
		// PreIncrement olur 
		int c=32;
		
		c=++c;
		System.out.println(c);// 33  olur  once artma olur 
	}
}
