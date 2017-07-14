package estado;

import fighter.Fighter;

public  class Congelado implements Estado {
	public static double coeficient = 0.5;
	public Congelado() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void apply(Fighter fighter) {
		// TODO Auto-generated method stub
		fighter.stats.speed /= 2;
	}

	@Override
	public void remove(Fighter fighter) {
		// TODO Auto-generated method stub
		fighter.stats.speed *= 2;
		
	}

	

}
