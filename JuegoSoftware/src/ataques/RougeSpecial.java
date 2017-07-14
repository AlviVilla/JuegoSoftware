package ataques;

import efectos.AplicarVeneno;
import efectos.Efecto;
import fighter.Fighter;

public class RougeSpecial extends Template {

	public RougeSpecial(Fighter fighter) {
		super(fighter);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Efecto addEfecto() {
		// TODO Auto-generated method stub
		return new AplicarVeneno();
	}

	@Override
	public void specialAttack() {
		// TODO Auto-generated method stub
		fighter.bonusDmg = fighter.stats.speed;
		fighter.efecto = addEfecto();
		fighter.stats.mana -= 10;
	}

}
