package factory;

import fighter.NPC;

public class CiudadMage implements Mage {

	public NPC generate(int lvl) {
		System.out.println("Wow! aparecio un mago de Ciudad! ");
		return new NPC(lvl);
	}

}
