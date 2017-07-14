package fighter;

public class Stats {

	public int maxHealth;
	public int health;
	public int attack;
	public int defense;
	public int intelligence;
	public int speed;
	public int maxMana;
	public int mana;
	
	public Stats(int lvl){
		
		maxHealth = 10*lvl+50;
		maxMana  = 10*lvl+1;
		mana = maxMana;
		health = maxHealth;
		attack = 2*lvl+3;
		defense = 1*lvl+1;
		intelligence = 2*lvl+3;
		speed =  2*lvl+2;
	}
	
	public void Upgrade(){
		maxHealth += 10;
		health += 10;
		attack += 2;
		defense += 1;
		intelligence += 2;
		
		
	}
}
