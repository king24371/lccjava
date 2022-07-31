package Game;

public class RPG {
	
	public static void main(String[] args) {
		
		Warrior wa = new Warrior("Soron",1000,500,100,0);
		
		Dancer da = new Dancer("Nami",700,900,80,50);
		
		wa.fight();
		da.encourage();
		System.out.println(da.getMp());
		
		
		
		
	}

}
