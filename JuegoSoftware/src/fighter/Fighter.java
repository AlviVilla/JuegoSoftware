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
	String tipo;
	public Strategy strategy;
	public Efecto efecto;
	public int bonusDmg;
	public Fighter() {
			estado = new Normal();
			bonusDmg = 0;
	}

	public int getHealth() {
		return stats.health;
	}
	public void takeDmg(int dmg){
		
		stats.health -= dmg;
		
	}
	public String getDecorador(){
		if(tipo=="mago")
			return descripcionAtaque + "Utilizo magia ";
		else if(tipo=="rogue")
			return descripcionAtaque + "Utilizo sus dagas ";
		else if(tipo=="warrior")
			return descripcionAtaque + "Utilizo su espadon ";
		else return descripcionAtaque;
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
		return stats.attack + bonusDmg +inventory.weapon.getValue() * strategy.getAttackFactor();
	}

	public double getDefense() {
		// TODO Auto-generated method stub
		return stats.defense + inventory.armor.getValue() * strategy.getDefenseFactor();
	}
	public void reciveDmg(int dmg){
		stats.health -= dmg;
		
	}

}