package Game;

public class Dancer extends Role {
	
	public Dancer(String name, int hp, int mp, int damage, int cure) {
		super(name, hp, mp, damage, cure);
		// TODO Auto-generated constructor stub
	}

	public void fight() {
		System.out.println("use kick");
	}
	
	public void cure() {
		System.out.println("use Cure");
	}
	
	public void encourage() {
		System.out.println("use Boost");
	}

}
