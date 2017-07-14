package ataques;

import efectos.Efecto;
import efectos.Neutro;
import fighter.Fighter;
import strategy.Normal;

public abstract class Template {
	public Fighter fighter;
	public Template(Fighter fighter){
		this.fighter = fighter;
		
	}
	public abstract Efecto addEfecto();
	
	public boolean checkMana(){
		if(fighter.stats.mana < 10)
			return false;
		return true;
		
		
	}
	public abstract void specialAttack();
	
	public void normalAttack(){
		fighter.bonusDmg = 0;
		fighter.efecto = new Neutro();
		
	}
	public void chooseAttack(){
		
		if(checkMana()){
			specialAttack();
		}
		normalAttack();
		
	}
}
