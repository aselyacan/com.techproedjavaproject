package day15methodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		System.out.println(toplama(11,15));//8   (toplama methodunun icine konulan  sayilara  argumant  denir 
		
		System.out.println(carpma(3,5));//15
	
		
		//  main medtho dun disinda  methon olusturup  medhod  cagirma  yapildi 
     	//  arugmentin ve parametrenin data type  uyumlu olmali ve ayni olmali 
		//  int  ise  int  =====String ise Strin  olmali 
	
		//  arugument  double parametre  int ise o  zaman auto widening den dolayi  program calisir  ..int  daha kucuk  double  
		
	}
	
	
//	 bir methodu main methoun  icnden cagirmak icn mutlaka  "static"  kelimesini  kullanmaliyiz
	// Method parantezsinin icinde  olusturulan variable la parametre denir  asagida olanlar 
	
	     public static int toplama(int num1,int num2) {  // void  bize  0  dondurur  ama  baska bir sonuc gormek istiyorsak  bir degisken koymali.
		      return num1+num2; 
		        
	     }
	     
	     public static int  carpma(int num1,int num2) {
	    	 
	   return num1*num2;
	    	 
	     }
	     
	     
}


