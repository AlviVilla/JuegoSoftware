package factory;

import fighter.NPC;

public class MontaņaMage implements Mage{


	public NPC generate(int lvl) {
		
		return new NPC(lvl, "mago");
	}


}
