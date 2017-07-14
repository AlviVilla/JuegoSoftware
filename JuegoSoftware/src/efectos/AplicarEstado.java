package efectos;

import estado.Estado;
import fighter.Fighter;

public class AplicarEstado implements Efecto {
	Estado state;
	public AplicarEstado(Estado estado){
		state = estado;
	}
	public void onHit(Fighter hited){
		
		hited.estado = state;
	}
	@Override
	public void onCast(Fighter caster) {
		// TODO Auto-generated method stub
		
	}
	
}
