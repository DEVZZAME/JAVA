package ex3_abstract;

public class Terran extends Unit{
	
	public Terran(String name, int energy) {
		super.name = name;
		super.energy = energy;
	}
	
	@Override
	public void decEnergy() {
		energy -= 3;
		
	}
	
	
}
