package estado;

import fighter.Fighter;

public interface Estado {
	
	public void apply(Fighter fighter);
	public void remove(Fighter fighter);
}
