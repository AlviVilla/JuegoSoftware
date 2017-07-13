package estado;

import fighter.Fighter;

public class Envenenado implements Estado {

	public static double coeficient = 0.5;

	public Envenenado( ) {
	}

	@Override
	public void apply(Fighter fighter) {
		// TODO Auto-generated method stub
		fighter.stats.defense /= 2;
		
	}

	@Override
	public void remove(Fighter fighter) {
		// TODO Auto-generated method stub
		fighter.stats.defense *= 2;

	}

	

}
