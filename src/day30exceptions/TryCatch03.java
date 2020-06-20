package day30exceptions;

public class TryCatch03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(exceptions());
	}
	@SuppressWarnings("finally")
	public static String exceptions() throws NullPointerException, ArithmeticException {
		String result = "";
		String v = null; //  nullPoinexception aliriz ve direk  catch gecer    result=result+ after i okumaz  null object dir onun icin uzunlugu olculmez 
		
		try {
			try {
				result = result + "before";
				v.length();
				result = result + "after";
			}catch(NullPointerException e) {
				result = result + "catch";
				throw new RuntimeException();
			}finally {
				result = result +"finally";
				throw new Exception();
			}
		}catch(Exception e) {
			result = result + "done";
		}
		return result;

	}
	
	// throw ile throws keywordlarinin farki
	/*1 Kullanim yeri farkli , throw  method un body lerinin icine  yazilir 
	 * 
	 * throws  ise  method  parentezinden hemen sonra method parentezi ve curly brase arasine yazilir   method() throws {} gibi 
	 * 
	 * 2 throw i  method  body'si icinde istenilen yerde kullanabiliriz  ... medthod  body si icin de exception almak  istedigimiz yerde kullanabiliriz 
	 *  throws  ise mecburen method isminden sonra bir kere kullanilabilir 
	 *  
	 *  3  1  throw kullanilirsa sadece bir tane exception uretilir 
	 *  
	 *  1  throws ile birden fazla exceptions uretilebilir 
	 *  
	 *  yani ") throws  NullPointerException , ArithmetcException gibi  yazilabilir 
	 * 
	 * 
	 */
	
	
}
