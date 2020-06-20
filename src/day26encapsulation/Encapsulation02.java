package day26encapsulation;

public class Encapsulation02 {
	
	private char  ilkHarf='S';
	
	private double para=23.75;
	
	private boolean emekli=false;
	
	/*Variable atanan degerin degistirilmesi istenmiyorsa  o variable alakali  
	 * 
	 * setter () olusturulmaz 
	 * 
	 * Variable atanan  degerin okunmasini  istemiyorsak  o variable  ile alakali  
	 * 
	 * getter ()  olusturulmamali 
	 * 
	 * Sadece  getter()  kullanir ve hic setter() kullanmazsak  , 
	 * 
	 * Variableler  update edilemez yada degistirilemez demektir 
	 * 
	 * bu tarz Class lara "immutable Class" denir 
	 * 
	 * sadece  setter  ()  kullanirsak  o zaman okunamaz demektir 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation01 obj=new Encapsulation01();
		System.out.println(obj.getKimlikNo());
		obj.setKimlikNo("1000000000000");
		
		System.out.println(obj.getKimlikNo());
		
		
	}

	public char getIlkHarf() {
		return ilkHarf;
	}

	public void setIlkHarf(char ilkHarf) {
		this.ilkHarf = ilkHarf;
	}

	public double getPara() {
		return para;
	}

	public void setPara(double para) {
		this.para = para;
	}

	public boolean isEmekli() {
		return emekli;
	}

	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}
