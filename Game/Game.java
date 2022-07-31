package Game;

public class Game extends RPG {
	public static void main(String[] args) {
		
		Warrior wa = new Warrior("Soron",1000,500,100,0);
		
		Dancer da = new Dancer("Nami",700,900,80,50);
		
		System.out.println("Loading player......" + "\n" + wa.getName() + "\n" + da.getName());
		System.out.println("3..." + "\n" + "2..." + "\n" + "1..." + "\n" + "Start Fight!");
		System.out.println();
		
		
		//Fight
		while(0 < wa.getHp()){
			if(wa.getHp() >= 0 || da.getHp() >= 0) {
			int i = (int)(Math.random()*110) + 1;
			System.out.println(i);
			if(i%2 == 0 && i >= 90) {
				System.out.print(wa.getName() + " ");
				wa.Hisatsu();
				int h = da.getHp() - 500;
				da.setHP(h);
			}else if(i%2 == 0) {
				System.out.print(wa.getName() + " ");
				wa.fight();
				int h = da.getHp() - wa.getDamage();
				da.setHP(h);
			}else if(i%2 != 0 && i%5 == 0) {
				System.out.print(da.getName() + " ");
				da.cure();
				int h = da.getHp() + da.getCure();
				da.setHP(h);
			}else if(i%2 != 0 && i%3 == 0) {
				System.out.print(da.getName() + " ");
				da.encourage();
				int h = wa.getHp() - (da.getDamage()*2);
				wa.setHP(h);
			}else {
				System.out.print(da.getName() + " ");
				da.fight();
				int h = wa.getHp() - da.getDamage();
				wa.setHP(h);
			}
			
			if(wa.getHp() <= 0 || da.getHp() <= 0) {
				break;
			}
			
		}
			System.out.println(da.getName() + "(" + da.getHp() + ")" + "\n"
			+ wa.getName() + "(" + wa.getHp() + ")" + "\n");
			
		}
		
		System.out.println();
		
		//Lose/Win
		if(wa.getHp() > da.getHp()) {
			System.out.println(da.getName() + "(" + da.getHp() + ")" + "/"
					+ wa.getName() + "(" + wa.getHp() + ")");
				System.out.println(wa.getName() + " Win");
			}else {
				System.out.println(da.getName() + "(" + da.getHp() + ")" + "/"
						+ wa.getName() + "(" + wa.getHp() + ")");
				System.out.println(da.getName() + " Win");
			}
				
		
		
		
	}

}
