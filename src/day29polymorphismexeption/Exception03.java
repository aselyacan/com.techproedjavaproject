package day29polymorphismexeption;

public class Exception03 {

	public static void main(String[] args) {
		
		
		//Bolme islemi  yapan bir program yaziniz 
		
		int num1=8;
		int num2=0;
		// ArithmeticException  bu Run time Exception dur matematikle alakali bir  hata dir 
		
		try {
			System.out.println(num1/num2);
			
		}catch(ArithmeticException e) {
			System.out.println("Sifir ile bolme yapilmaz ");
		}catch (Exception e) {
			System.out.println("Her exception i yakala ");
		}
		// try dan sonra  bir den fazla catch kullanilabili r
		// ama ustteki catch alttaki cathc in  child i olmalidir 
		// specific den genele dogru  dizmelisiniz once  chil  sonra parent  yazilmali cunku java  yukaridan asagi  okur  ve parent daha genel bir hatalar tabiridir 
		
	}

}
