package day11stringmethods;

public class StringReplaceAndConcat {

	public static void main(String[] args) {
		// 
		
		
		
		// concat() method  concatenation  yapmanin  yani diger  iki string i birlestirmenin  diger yontemidir..  yapistirma birlestime  dir 
		
		
	String 	str1="Ali";
	
	String str2="Veli";
	
	System.out.println(str1+str2);//  AliVeli  seklinde  yazilir
	
	
	System.out.println(str1.concat(str2));//  AliVeli  
	
	                                     // str1+str2   ile str1.concat(str2) aynidir
	
	
	System.out.println(str1.concat(str2).concat(str1));   // concat() i istedigimiz  kadar  pespese  kullanabilir 
	
	
	System.out.println(str1.concat("==> ").concat(str2));// Ali==>Veli
	
	
	// replace() methodu  bir characterin yerine baska bir character  yazmaya  yarar.
	
	// Bir  characterin butun gorunumlerinin yerine baska  character  yazamaya  denir
	
	//ornekk    ata==>ana  
	
	String str3="ata";
	
	System.out.println(str3.replace("t","n"));// ana  oldu  t gordugun yere  n koy  demek 
		
	System.out.println(str3.replace("a","u")); //utu  oldu  
	
	System.out.println(str3.replace("a","o")); //  oto  gecici bir degisim dir  ... orjinali bozulmus olmaz 
	 // annnenizin ismi  ayse  ama siz  ona canim diyorsunuz  ... her kullanimda tekrar  ayse gibi  calisir ....
	
	System.out.println(str3.replace("x","y"));//   replace methodu  var olan bir characterin yerine baska bir character  atamakk demektir 
	// ata ...x olmadigi icin kaldiyorum ,  yerine de  y koymuyorum ... x olmadigi icin herhangi bir degisim yapmaz 
	
	System.out.println(str3.replace("","y"));
	
	
	System.out.println(str3.replace("","/"));
	
	//  hic bir sey yerine forward /  konuluyor  ....
	
	System.out.println(str3.replace("t",""));// t yi ihma eder yada siler .. Biz bu yontemi bir characteri Stringden silmek icin kullaniriz ....
	
	
	System.out.println(str3.replace("a",""));// butun a karekterleri silinir  
	
	System.out.println(str3.replace("at","Mustaf"));// Mustafa
	
	System.out.println(str3.replace("at","y"));//ya 
	
	
	//  replaceFirst() 2. versiyonu 
	
	//degistirmek istedigimiz karakterin sadece ilk gorunumunu  degisitirir.
	
	String str4="karakartal";
	
	System.out.println(str4.replaceFirst("k","K"));// Karakartal ilk harfi  buyuk yapmak icin kullanildi
	
	System.out.println(str4.replaceFirst("a","e")); // ilk a  degisecek  o da e olacak ..kerakartal //  bu gecici bir degisiklik
	
	System.out.println(str4.replaceFirst("ka","SE"));// SErakartal  ....
	
	System.out.println(str4.replaceFirst("ka","A")); // Arakartal 
	
	System.out.println(str4.replaceFirst("kar","")); // akartal 
	
	System.out.println(str4.replaceFirst("kara","A"));// Akartal
	
	System.out.println(str4.replaceFirst("karakartal","cimbombom"));// cimbombom karakartal  in yerine  cimbombom olur
	
	
	// soru 
	
	String text="Ali okula gitti. Ali otobuse bindi. Ali eve geldi. Ali  yemek yedi.Ali uyudu";
	
	System.out.println(text.replace("Ali", "Veli")); //  Ali in  hepsinin yerine Veli geldi ....
			
	
	
	// replaceAll() ve replace() methodlari  tamamiyla  ayni seyi yapar..
	
	// replace() methodunda  isterseniz   tek harli characterler  icin   tek tirnak  
			
	String kart="12323445656767";

	}

}
