package fighter;

import ataques.Template;
import efectos.Efecto;
import estado.Estado;
import estado.Normal;
import inventory.Inventory;
import strategy.Strategy;


public class Fighter {
	
	public Stats stats;
	public Inventory inventory;
	public Estado estado;
	String descripcionAtaque="";
	public String tipo;
	public Strategy strategy;
	public Template template;
	public Efecto efecto;
	public int bonusDmg;
	public Fighter() {
			estado = new Normal();
			bonusDmg = 0;
			stats = new Stats(2);
			
	}
	public int getMana(){
		return stats.mana;
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
;
	public double getAttack() {
		if(inventory!=null && strategy!=null)
		// TODO Auto-generated method stub
		return stats.attack + bonusDmg +inventory.weapon.getValue() * strategy.getAttackFactor();
		else{
			if(inventory==null && strategy==null)
				return stats.attack + bonusDmg + 2 * 5;
			else if(inventory==null)
				return stats.attack + bonusDmg+ strategy.getAttackFactor();
			else
				return  stats.attack + bonusDmg+ inventory.weapon.getValue();
		}
	}

	public double getDefense() {
		if(inventory!=null && strategy!=null)
			// TODO Auto-generated method stub
			return stats.defense +inventory.armor.getValue() * strategy.getDefenseFactor();
			else{
				if(inventory==null && strategy==null)
					return stats.defense + 2 * 2;
				else if(inventory==null)
					return stats.defense + strategy.getDefenseFactor();
				else
					return  stats.defense + inventory.armor.getValue();
			}
	
	}
	public void reciveDmg(int dmg){
		stats.health -= dmg;
		
	}

}