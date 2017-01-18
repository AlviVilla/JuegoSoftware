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
		if(stats.health>0)
			return true;
		// TODO Auto-generated method stub
		return false;
	}

}