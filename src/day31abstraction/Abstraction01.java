package day31abstraction;

public abstract class Abstraction01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//       class abstract olunca obje uretmez.
		// constructor lari yoktur cunku obje uretmezler 
//		method abstract olunca body si olmaz.
		
//		concrete class ın icine abstract method konmaz,sadece concrete konur.
//		abstract class ın içine iki tür method da konur concret (body) ;li ve absract bodys  medtholar 
		
//		abstarct methoda body koymaya calısırsam CompiletimeError
//		concrete methoda body koymazsam CompiletimeError.
		
//      abstract class ın cocugu olur bu cocuk concrete da olur abstract da
//      ama child i concrete yaparsak parentte abstract olan metodlari child içinden override
//		edip body koymak zorundayız, yani consrete yapmak zorundayız..
//		bunun bir faydası var parentdaki abstract methodu almak zorunda kalıyoruz her child da.
//		mesela bir kural getirdin abstract methoda koydun. bunu mecbur her child override etmek için çağırcak
		//  abstract methodlar static kabul etmiyor ve hata verir 
		
		//
		// herhangi bir parent tarafindan ovveride edilen abstrackt method  altta ki concret childlar tarafindan override edilmese de olur 
		
	}
	
	public static void concretMethod() {
		System.out.println("ben concretim");
	}

	public  abstract void  abstractMethod();
	
	//System.out.println(); olmuyoir 
}
