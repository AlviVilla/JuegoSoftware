package fighter;

import estado.Estado;

import inventory.Inventory;
import strategy.Strategy;


public class Fighter {
	
	public Stats stats;
	private Inventory inventory;
	

	Strategy strategy;

	public Fighter() {
			
	}

	public int getHealth() {
		return stats.health;
	}
	public void takeDmg(int dmg){
		
		stats.health -= dmg;
		
	}
	
	public boolean isAlive() {
		return(stats.health>0);
	}

	public int getSpeed() {
		// TODO Auto-generated method stub
		return stats.speed;
	}

	public double getAttack() {
		// TODO Auto-generated method stub
		return stats.attack + inventory.weapon.getValue();
	}

	public double getDefense() {
		// TODO Auto-generated method stub
		return stats.defense + inventory.armor.getValue();
	}
	public void reciveDmg(int dmg){
		stats.health -= dmg;
		
	}

}