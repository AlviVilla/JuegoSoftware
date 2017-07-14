package decorator;

import fighter.Fighter;

public class Defensivo extends Decorator{

	Fighter fighter;
	public Defensivo(Fighter fighter){
		this.fighter = fighter;
		
	}
	
	@Override
	public String getDecorador() {
		// TODO Auto-generated method stub
		return fighter.getDecorador() + " un poco flojo, pero estratégico!";
	}

}
