package efectos;

import fighter.Fighter;

public class BuffarDefensa implements Efecto {

	@Override
	public void onHit(Fighter hited) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCast(Fighter caster) {
		caster.stats.defense += 2;
		
	}
	
}
