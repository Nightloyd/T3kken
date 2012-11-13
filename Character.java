import java.util.*;

public class Character{
	private String name;
	private int hp;
	private int hitChance;
	private int protection;
	private Weapon weapon;
	
	public Character(String name, int userHitChance, int protection, Weapon weapon){
		this.hp = 100;
		this.hitChance = userHitChance;
		this.name = name;
		this.protection = protection;
		this.weapon = weapon;
	}
	
	public int hit(Character annan){
		Random randomGenerator = new Random();
		int bonk = randomGenerator.nextInt(100);
		if (bonk < this.hitChance){
			
			int damage = weapon.damage() * protection.damageAbsorbPercent();
			System.out.println("Tjoff! " + name + " träffade.");
			return damage;
			
		}
		System.out.println("Klang! " + name + " missade.");
		return 0;
	}
	
	public void dies(){
		System.out.println("Aaaaaaaaaargh!");
	}
	
	public String getName(){
		return name;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	public int getHp(){
		return hp;
	}
	
	public int getProtection(){
		return protection;
	}
	
	public Weapon getWeapon(){
		return weapon;
	}
}//Class