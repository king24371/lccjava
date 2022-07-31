package Game;

public class Role {
	
	private String name;
	private int hp,level,mp,damage,cure;
	
	public Role(String name,int hp,int mp,int damage,int cure) {
		this.name = name;
		this.hp = hp;
		this.level = 1;
		this.mp = mp;
		this.damage = damage;
		this.cure = cure;
	}
	
	public void fight() {
		System.out.println("Attack");
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getLevel() {
		return this.level;
	}
	
	public int getMp() {
		return this.mp;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getDamage() {
		return this.damage;
	}
	
	public int getCure() {
		return this.cure;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHP(int hp) {
		this.hp = hp;
	}
	
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	public void setLevel(int level) {
		this.level = level;
		
	}
	
	
	
	

}
