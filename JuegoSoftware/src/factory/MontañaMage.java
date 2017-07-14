package factory;

import fighter.NPC;

public class MontañaMage implements Mage{


	public NPC generate(int lvl) {
		
		return new NPC(lvl, "mago");
	}


}
