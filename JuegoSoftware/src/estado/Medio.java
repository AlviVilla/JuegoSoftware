package estado;

import fighter.Fighter;

public class Medio implements Estado {
Fighter fighter;
	public Medio(Fighter fighter) {
		// TODO Auto-generated constructor stub
	this.fighter=fighter;
	}

	@Override
	public Estado getEstado(Fighter fighter) {
		return null;
		
	}


}
