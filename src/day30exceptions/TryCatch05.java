package day30exceptions;

public class TryCatch05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			hop();
		}catch (Exception e) {
			//e.printStackTrace();  bu daha detayli    hata mesaji verir ve hangi satirlarda  hata oldugunu verir   
			//  hatanin nerde oldugunu  detayli gosterir ve cok onemlidir ve hatayi bulmak icindir cok kullanilir 
			// exception satirlarinin olusum  sirasina gore console gosterir 
			
			//System.out.println(e);
		}
	}

	private static void hop() {
		throw new RuntimeException("cannot hop");
	}
}
