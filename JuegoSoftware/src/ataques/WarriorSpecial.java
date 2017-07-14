package ataques;

import efectos.BuffarDefensa;
import efectos.Efecto;
import fighter.Fighter;

public class WarriorSpecial extends Template {

	public WarriorSpecial(Fighter fighter) {
		super(fighter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Efecto addEfecto() {
		// TODO Auto-generated method stub
		return new BuffarDefensa();
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		fighter.bonusDmg = fighter.stats.defense / 3;
		fighter.efecto = addEfecto();
		fighter.stats.mana -= 10;
	}

}
