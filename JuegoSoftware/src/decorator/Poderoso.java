package decorator;

import fighter.Fighter;

public class Poderoso extends Decorator{
	Fighter fighter;
	public Poderoso(Fighter fighter){
		this.fighter=fighter;
	}
	
	
	@Override
	public String getDecorador() {
		// TODO Auto-generated method stub
		return fighter.getDecorador() + " increiblemente poderoso!";
	}

}
