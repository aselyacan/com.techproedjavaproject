package day19arrays;

public class Arrays01 {

	public static void main(String[] args) {
	
		// Integer    Array olusturalim
		
		int arr1[]=new int[5];//0 0 0 0 0 sifir vardir  default olarak 0 atanir lenght uzunlugu 
		//char array  olusturalim
		//System.out.println(arr1);==> array in referene ini  verir 
		System.out.println(arr1[0]);// memory de yeri consolde  gosterir // 0  index deki yeri olan ilk elamani verir
		// elemanlar icin index kullanilir 
		System.out.println(arr1[3]);// 4. sifiri ekranda goruruz index i  3 olan 0 yazdiri
		
		arr1[0]=12;
		        System.out.println(arr1[0]);
		
		arr1[1]=11;
				System.out.println(arr1[1]);
		arr1[2]=36;
		        System.out.println(arr1[2]);
		arr1[3]=17;
		        System.out.println(arr1[3]);
		arr1[4]=9;
		        System.out.println(arr1[4]);
		
		
		// array  daki elemanlari  ekrana yazdirmak icin for dongusu  kullanin
		System.out.println("for ile tek hamlede  array  dizisi yazacagiz");
		
		for (int i=0; i<5; i++ ) {
			System.out.println(arr1[i]);
		}
		
	// array de  olamayan  index e  deger atamasi yapin
		
//		arr1[5]=23;
//		System.out.println(arr1[5]);//  array da olmayana index e deger atamasi yapilirsa  Run Time eRROR  VERIR...
		
	}

}
