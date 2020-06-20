package day29polymorphismexeption;

public class Exception01 {

	public static void main(String[] args) {
		//
		
		//Exception: problemli istisnai bir durum
		// hadding exception: kendimin çözebildiği problemler
		// throwing exception: kendi başıma (yardımsız) çözemeyeceğim problemler
		// Exception'lar 2 türlüdür run time ve compile time error
		// compile time exception'lara checked exception da denir
		// checked exception'lar mutlaka düzeltilip devam edilmeli
		
		// mutlaka bilinmesi gereken check exception'lar
		// 1) FileNotFoundException: programımam dışarıdan dosya almak istediğimde dosyanın bulunamadığı zaman veren hata
		// 2) IOException: input output exception: programın içine bilgi alma veya programdan dışarıya bilgi aktarma durumlarında oluşan hata
   
		
		// Exception aslında istisna i problem-problem olan istisnalar demek
				//sayi/0 ==> bolme islemi icin istisna bir durum ama problemli istisna
				//temelde 2 tür exception var.
				// arabanın lastiği patladı. ama kenarı çekip tekerleği degistirebilirim.
				//yani üstesinden gelebilirim. bunlara handling exception denir.
				
				
				// araba üstüne bir kaplan saldırsa bagırabilirsin sadece. buna throwing exception
		        //ilan ediyorum. bana kaplan saldırdı. yardım isteme
				
				
		// compile time exception un diğer adı checked exception da denir.
		//bazı exceptionlar handler edilmelidr. checked exceptionlar mutlaka handle(tamir) edilmelidir
			
		//ne tip check exceptionlar var.?
		//1-) FileNotFoundException: dosya bulunamadı hatası ne zaman veirlir? dosya bulunamadıgı zaman
		//biri dosyayı silmiş olabilir ben yanlıs yazmıs olabilirm
		//2-) IOException: input out exception. ne zaman verilir?
		//input içeri birşey almak output dışarı bir sey vermek. file bulma koduma dısardan bir sey alak demektir. file almak input faaliyetidir.
		//FileNotFoundException: IOException nun alt kümesidir.
		
		
		//iki türlü yapıyoruz:
			// 1*) throws yazmak: javaya: "problem varsa yardım iste demektir."// hazir java teknik ifadeler yazar ve java bilmeyenler icin okumasi zordur 
			// 2-)try-catch blocks. try: dene, catch= yakala demketir.
			// 3-) dene- hata cıkarsa -yakala-yapamazsan-bana mesaj at. readable dır.
			//aradaki fark: try catch önce dener. olmazsa mesaj atar.
			//ama trow da hazır mesajları ekrana atar problem hakkında. ama ayrıntı ve hatanın yerini sözleyen bir mesaj yazabilirz. bu yüzden readable dir.
		    // try catch block kullanmak daha iyidir cunku readable dir ...
		
		

	}

}
