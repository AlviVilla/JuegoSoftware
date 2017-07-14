package efectos;

import estado.Congelado;
import estado.Estado;
import fighter.Fighter;

public class AplicarCongelado implements Efecto {
	
	public AplicarCongelado(){
		
	}
	public void onHit(Fighter hited){
		
		hited.estado.remove(hited);
		hited.estado = new Congelado();
		hited.estado.apply(hited);
	}
	@Override
	public void onCast(Fighter caster) {
		// TODO Auto-generated method stub
		
	}
	
}
