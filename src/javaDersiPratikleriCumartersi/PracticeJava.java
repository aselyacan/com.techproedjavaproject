package javaDersiPratikleriCumartersi;

public class PracticeJava {

	public static void main(String[] args) {
		
		System.out.println(17 + 3); //20
		System.out.println(17 + "" + 3 ); //173
		System.out.println("" + 17 + 3); //173
		System.out.println(17 + 3 + ""); //20
		System.out.println(24 + 3 + 6 + "Ali" +10 + 5 ); //33Ali105
		System.out.println("" + 24 + 3 + 6  +10 ); //243610
		
		// Asagidaki sonuc nedir?
  
		
		int harf = '1';// ascii  degeri 49
         char ch = '2'; // ascii degeri 50
//

		
		System.out.println(harf+ch); //12 mi?, 3 mu? 99 mu?
//
//      System.out.println(harf); // 1 mi? 49 mu?
//
		System.out.println(ch); // 2 mi? 50 mi?
//
        char deneme = 50;
        int num='@';
//
        System.out.println(num);
        System.out.println(deneme); // 2 mi? 50 mi?

		System.out.println(17 + 3); //20
		System.out.println(17 + "" + 3 ); //173
		System.out.println("" + 17 + 3); //173
		System.out.println(17 + 3 + ""); //20
		System.out.println(24 + 3 + 6 + "Ali" +10 + 5 ); //33Ali105
		System.out.println("" + 24 + 3 + 6  +10 ); //243610
		
		
		// ! % * $ @ & semnbollerinin  Accii  code degerlerni bulunuz
		
		int unlem='!';
		System.out.println(unlem+"unlem");
		
		int yuzde='%';
		
		System.out.println(yuzde+"yuzde");
		
		int dolar='$';
		System.out.println(dolar+"dolar");
		
		int at='@';
		System.out.println(at+"@");
		
		int ve='&';
		
		System.out.println(ve+"&");
		
		int star='*';
		System.out.println(star+"*");
		
		
		// int ve  long  data  typinin  maximum ve  minumum degeriini  bulun ve ekrana yazdirin
		
       int maxValue=Integer.MAX_VALUE;//  tercih edilen yontemdirm
		
       
       System.out.println(Integer.MAX_VALUE);// hard codin  tercih  edilmez 
		
       System.out.println(maxValue);
		
		

		
		int minValue=Integer.MIN_VALUE;
		
		
		System.out.println(minValue);
		
		int  newValue=maxValue+minValue;
		
		System.out.println(newValue+"sonuc ");
		
		// sayi  yazarken  _ alt tre koymak sayilarin arasina  bir degisiklik yapmaz okumayi kolaylastirir
		
		
		//   min  ve max degeri  islem  yaparken  hangi sayi hangir  data ya uygundur  diye  aramak  icin bulmak icin 
		
		
		long maxValue1=Long.MAX_VALUE;
		System.out.println(maxValue1);
		
		long minValue2=Long.MIN_VALUE;
		System.out.println(minValue2);
		
		long tlfnum=535_2003030L;
		
		System.out.println(tlfnum+"numra");
		
		long newLong=maxValue1+minValue2;
		
		System.out.println(newLong);
		
		
		
	}

}
