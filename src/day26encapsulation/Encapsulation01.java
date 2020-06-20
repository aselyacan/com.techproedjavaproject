package day26encapsulation;

public class Encapsulation01 {

	
	private String kimlikNo="34212367512";
	
	private int krediKartNo=1234578;
	
	private boolean  soguk=true;
	
	
	
	public static void main(String[] args) {
		
	  Encapsulation01 obj=new Encapsulation01();
		
		obj.setKimlikNo("100000000");

		System.out.println(obj);
		
		// encapsulation data saklama  (data hiding)  yontemidir
		// encapsulation   iki  etapta  yapilir 
		
		// 1) data yi  (variable ,  method ) private  yapmalisiniz
		
		// 2) public olan  getter () ve  setter()  methodlar uretmeliyiz
		// getter() data yi  okumamiza  yarar ama data yi  degistiremez sadece okumamiza  yarar
		// Dışarından ya da yanlış kullanım sonucu kodu ve veriyi koruyan bir mekanizmadır. Bir diğer şekliyle iş metot tarafından yapılır fakat metotun içeriği gösterilmez.
		
		// setter() da datayi  degistirmemize  yarar
		
		
	}

	// getter uretmek icin 1) acces modifier  public olmalidir
	//                     2) return type   variable in return type ile ayni olmalidir
	                   //  3) Method ismi "get+ variable ismi  " seklinde olmalidir
	
	
	public  String getKimlikNo() {
		return kimlikNo;
	}
	
	public  int getKrediKartNo() {
		return krediKartNo;
	}
	
	// return type boolean ise  metho ismi  "is" ile baslar . "get " kullanilmaz 
	public boolean isSoguk(){
		return soguk;
	}
	
	// setter() uretmek icin  
	/*1 acces modifier  public olmali
	 * 
	 * 2 return type  void olmali
	 * 
	 * 3 method ismi "set + variable ismi " seklinde olmali
	 * 
	 * 4 Parametre kullanilmali %99  gibi 
	 * 
	 * 5  setter() methodlarin ismi  boolean lar icin de "set "ile baslar 
	 * 
	 */
	// setter ()  update  yada degistirmek icin kullanilir 
	//  setter  data type herzaman  void olur 
	// void  iki yerde  kullanilir   bir  yazdirmada  bir de action larda 
	// setter lerin icin mutlaka  bir parametre  konulmali 
	
	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo=kimlikNo;
	}
	
	public void setKrediKartNo(int krediKartNo) {
		this.krediKartNo=krediKartNo;
	}
	public void setSoguk(boolean soguk) {
		this.soguk=soguk;
	}
	
}
