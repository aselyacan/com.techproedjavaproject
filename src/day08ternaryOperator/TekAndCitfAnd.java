package day08ternaryOperator;

public class TekAndCitfAnd {

	public static void main(String[] args) {
		// 
		System.out.println(3<2 && 5>4); // and isleminde  bir tanesi  yanlis ise sonuc False dir 
		
		//System.out.println(3<2 && 5>4 && 6>4 && 1>4 && 5>7 && 4>4 );
		// &&  java ilk  False  bulduktan sonra  diger  kontrolleri  yapmaz.
		
		// bu da  java nin  yukunu  azaltir.Yukun  azaltimasini sure  kazandirir ve java hata yapmaz
		
		// riskini azaltir...
		
		
		System.out.println(3<2 & 5>4);
		
		// & tek and  ilk false bulduktan sonra diger kontrolleri  de yapar 
		// bu da java icin  zaman kaybidir ve  islem icin hala emek  sarfediyor..
		
		
		
		
		
	}

}
