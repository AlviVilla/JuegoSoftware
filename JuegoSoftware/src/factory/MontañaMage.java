package factory;

import fighter.NPC;

public class Monta�aMage implements Mage{


	public NPC generate(int lvl) {
		
		return new NPC(lvl, "mago");
	}


}
