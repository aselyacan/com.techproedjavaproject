package day28overriding;

public class Mammal extends Animal {

	public boolean birth=true;
	public String  name="kedi";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mammal mammal=new Mammal();
	}

	public void feed() {
		System.out.println("Yavrularini besler");
	}
	
	public Mammal() {
		
		// this. icinde bulundugunuz  class da ki  variable ve method lara  ulasmaninizi  saglar
		System.out.println(this.birth);
		this.feed();// yavrularini besler 
		
		
		// child-parent ilisiki varsa  this kullanarak parent class da ki 
		// variable ve method lara ulasabilirsiniz 
		// ama  parent class daki  variable ve method lara  ulasmak icin this. kullanmayin 
		// cunku child ve parent lardaki   ayni isimli  variable ve method larda  proble yasayabilir 
		// Genel kullanimda this class icindekiler icin 
		// super  der parent class dakiler icin kullanilir ve  farklilik  yapilmamamsi gerekiyor  insanlari sasirtmamak icin 
	
		System.out.println(this.age);// 4  parentden gelen yas
		System.out.println(this.name);// karabas  parent den gelen 
		this.move();// hayvanlr hareket eder
		System.out.println(this.name);// kedi  ifadesi gorulur cunku  this  bu defa  chil da ki  name  stringini okur ve  parent dakini ihmal eder   dusunur ki parent deki gerli  degil diye 
	
		// super  paratez  olmadan yazilan  super  parent lar daki variable ve methodlara ulasmanizi saglar 
		//  super.  baba ve dedeler deki  variablara ulasmayi saglar ama class daki  variablara  ulasmaz 
		
		
		// parent'dakilere super kullanarak  ulasmak daha guvenlidir 
		
		
		System.out.println(super.age);//4
		System.out.println(super.name);// karabas
		super.move();// hayvanlar harekt eder 
		
	}
}
