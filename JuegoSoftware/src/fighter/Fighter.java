package fighter;

import efectos.Efecto;
import estado.Estado;
import estado.Normal;
import inventory.Inventory;
import strategy.Strategy;


public class Fighter {
	
	public Stats stats;
	private Inventory inventory;
	public Estado estado;
	String descripcionAtaque="";
	public Strategy strategy;
	public Efecto efecto;
	public Fighter() {
			estado = new Normal();
	}

	public int getHealth() {
		return stats.health;
	}
	public void takeDmg(int dmg){
		
		stats.health -= dmg;
		
	}
	public String getDecorador(){
		return descripcionAtaque;
		
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
		return stats.attack + inventory.weapon.getValue() * strategy.getAttackFactor();
	}

	public double getDefense() {
		// TODO Auto-generated method stub
		return stats.defense + inventory.armor.getValue() * strategy.getDefenseFactor();
	}
	public void reciveDmg(int dmg){
		stats.health -= dmg;
		
	}

}