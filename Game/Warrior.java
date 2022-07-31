package Game;

public class Warrior extends Role {
	
	public Warrior(String name, int hp, int mp, int damage, int cure) {
		super(name, hp, mp, damage, cure);
		// TODO Auto-generated constructor stub
	}

	public void fight() {
		System.out.println("use Slash");
	}
	
	public void Hisatsu() {
		System.out.println("use 3刀流_Rashomon");
	}
	
	
	

}
