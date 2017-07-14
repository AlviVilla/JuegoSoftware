package fighter;

import decorator.Poderoso;
import estado.Estado;

import inventory.Inventory;
import strategy.Strategy;


public class Fighter {
	
	public Stats stats;
	private Inventory inventory;
	String descripcionAtaque="";

	public Strategy strategy;

	public Fighter() {
			
	}
	public String getDecorador(){
		return descripcionAtaque;
		
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
		int i =1;
		if(i==0){
			Fighter fighter = new Fighter();
			fighter=new Poderoso(this);
			
		}
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