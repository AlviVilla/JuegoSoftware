package efectos;

import fighter.Fighter;

public interface Efecto {
	public void onHit(Fighter hited);
	public void onCast(Fighter caster);
}
