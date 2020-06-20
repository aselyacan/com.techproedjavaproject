package day30exceptions;

public class TryCatch02 {

	 static String m;
	public static void main(String[] args) {
		//
		
		 
        String s = "";
        System.out.println(s.length());//0
        try {
            s+="t";
        }catch(Exception e) {
            s+="c";
        }finally {
            s+="f";
        }
        s+="a";
        
        System.out.println(s);
        
        //String'e null atandigi zaman veya instance variable'a 
        //deger atamasi yapilmadiginda length() methodu calismaz
        //ve NullPointerException exception alirsiniz.
        String n = null;
        //Asagidaki iki satirdaki kod da exception verir
       
        //System.out.println(n.length());
        //System.out.println(m.length());  
        
    	
      //Interview: final, finally, finalize keyword'lerinin farki nedir?
      /*
       1)finally{}(block) ==> try-catch block'dan sonra kullanilir. 
                       Exception olsa da olmasa da calisir.
       2)final(keyword) ==>  Variable'larda final kullanilirsa, o variable'in
                    degeri degistirilemez.Mesela pi sayisi final yapildigi
                    zaman degeri degistirilemez final String code = "POS";
                    
                    Method'larda final kullanilirsa, method body'leri degistirilemez
                    dolayisiyla overriding yapilamaz 
                    
                    Class'larda final kullanilirsa, o class extend edilemez.
                    Inheritance mumkun degildir.
                    public final class Animal{  } ==> public class Dog extends Animal{ } OLMAZ  
        3)finalize()(method) ==> finalize() methodu, Garbage Collector'in imha edecegi
                                 datalari imha edilecek hale getirir.                       
       */
		
	}

}
