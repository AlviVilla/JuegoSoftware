package ataques;

import efectos.AplicarCongelado;
import efectos.Efecto;
import estado.Congelado;
import fighter.Fighter;

public class MageSpecial extends Template{

	public MageSpecial(Fighter fighter) {
		super(fighter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Efecto addEfecto() {
		// TODO Auto-generated method stub
		return new AplicarCongelado();
	}

	@Override
	public void specialAttack() {
		fighter.bonusDmg = fighter.stats.intelligence;
		fighter.efecto = addEfecto();
		fighter.stats.mana -= 10;
		
	}
	
}
