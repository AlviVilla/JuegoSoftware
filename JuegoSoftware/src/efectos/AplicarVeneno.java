package efectos;

import estado.Envenenado;
import estado.Estado;
import fighter.Fighter;

public class AplicarVeneno implements Efecto {
	Estado state;
	public AplicarVeneno(){
		
	}
	public void onHit(Fighter hited){
		
		hited.estado.remove(hited); 
		hited.estado = new Envenenado();
		hited.estado.apply(hited);
	}
	@Override
	public void onCast(Fighter caster) {
		// TODO Auto-generated method stub
		
	}
	
}
