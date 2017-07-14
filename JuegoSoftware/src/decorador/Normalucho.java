package decorador;

import fighter.Fighter;

public class Normalucho extends Decorator{
Fighter fighter;
	public Normalucho(Fighter fighter){
		this.fighter = fighter;
	}
	
	@Override
	public String getDecorador() {
		// TODO Auto-generated method stub
		return fighter.getDecorador() + " muy por la media";
	}

	
	
}
