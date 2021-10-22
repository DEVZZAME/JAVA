package ex3_abstract;

public class UnitMain {
	public static void main(String[] args) {

		Terran t1 = new Terran("ÇØº´", 100);
		t1.decEnergy();
		System.out.println(t1.energy);
		
		Protoss p = new Protoss("¼ÅÆ²", 200);
		p.decEnergy();
		p.decEnergy();
		System.out.println(p.energy);
		
		Zerg z = new Zerg("¸Íµ¶Ãæ", 50);
		z.decEnergy();
		System.out.println(z.energy);
		
		
		
		
		
	}//main

}
