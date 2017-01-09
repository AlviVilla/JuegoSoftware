package fighter;

import estado.Estado;
import estado.Medio;
import estado.Miseria;
import estado.Perfecto;
import strategy.Strategy;

public class Fighter {
	private static int totalHealth;
	private int health;
	private int attack;
	private int defense;
	private int intelligence;
	private int speed;

	Estado miseria;
	Estado medio;
	Estado perfecto;
	Estado state;

	Strategy strategy;

	public Fighter() {
		this.miseria = new Miseria(this);
		this.medio = new Medio(this);
		this.perfecto = new Perfecto(this);
		if (health >= totalHealth * 2 / 3) {
			state = perfecto;
		} else if (health < totalHealth / 4) {
			state = miseria;
		} else {
			state = medio;
		}
		;

	}

	public Estado getState() {
		if (health >= totalHealth * 2 / 3) {
			state = perfecto;
			return state;
		} else if (health < totalHealth / 4) {
			state = miseria;
			return state;
		} else {
			state = medio;
			return state;
		}
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getHealth() {
		return health;
	}

	public void setIntelligence(int intelligence) {
		// TODO Auto-generated method stub
		this.intelligence = intelligence;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

}
