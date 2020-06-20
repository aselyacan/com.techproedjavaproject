package day25stringbuilders;

public class StringBuilder01 {

	public static void main(String[] args) {
		// StringBuilder  class in  String uretmeye  ve uretilen Stringleri  manipule etmeye yarar
		
	    // String class i kullanarak  String  uretirsiniz yaptiginiz degisikler 
		// ilk urettiginiz Stringi etkilemez , ama illa ki ilk uretilen String degissin istenirese  
		// o zaman  atama yapilmasi gerekiyor
		//===>>str=str.substring(1); gibi ******
		//String class ini  kullanarak uretilen String ler  atamasiz degistirilemedigi icin  
		// String class a  (immutable ) denir yani  atama olmadan  degisiklige kapali olan Stringler dir 
		
		
	     String str="Ali";            // String class ile uretilen veriler  degistirlemezler ****** 
		
		str=str.substring(1); // ===>li  value su li olan bir object  olusturur ama str hala Ali olarak kalir  atamadan dolayi ekranda  li yazilir bu cok onemlidir  her yerde sorulur 
		System.out.println(str);// li  
		
	    StringBuilder strBld=new StringBuilder("Ayse"); //  StringBuilder ile yapilan strinler  append  method ile degisitirlebilirler 
		                                                //  en bastaki  str  degisir buna  da degisimi yansittigi icin// mutable // denir /
		
		strBld.append("Can"); // append() methodu Stringe  yeni bir String  eklemek icin kullanilir 
		                      // Concatenation yapar 
		
		System.out.println(strBld);// AyseCan  seklinde ekleyerek degistirdi 
		
		
		// Degisiklik olmasini istiyorsak  StringBuilder kullanmaliyiz ama  degisklik olmasin isteniyorsa  String kullanilmali 
		
		//2.yol String Builder uretmek icin 
		
		StringBuilder strBld2=new StringBuilder();  //  bos bir String  urettik 
		
		strBld2.append("Ali Can "); // Bos Strign e  Ali Can ekledim
		
		
		// 3. Yol   
		
		StringBuilder strBld3= new StringBuilder(7); //  7 lenght uzunlugu  ifade eder  uzunlugu  5 oalan bir string urettik ama icinde  0 var 
		
		strBld3.append("Ali");
		
		strBld3.append("Kahraman");
		
		// String Builder  buitable dir  yani  uzayabilir  yada buyutulebilir ve  ekleme yapilabilir problem cikmaz  ozellikla  iban gibi islemler yaparken iyi dir 
		
		
		
		
		
		

	}

}
