package fighter;

public class Stats {

	public int health;
	public int attack;
	public int defense;
	public int intelligence;
	public int speed;

	
	public Stats(int lvl){
		
		health = 10*lvl+50;
		attack = 2*lvl+3;
		defense = 1*lvl+1;
		intelligence = 2*lvl+3;
		speed =  2*lvl+2;
	}
	
	
}
