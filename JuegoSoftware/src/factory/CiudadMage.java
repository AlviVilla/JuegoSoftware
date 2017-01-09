package factory;

import fighter.NPC;

public class CiudadMage implements Mage {

	public NPC generate() {
		System.out.println("Wow! aparecio un mago de Ciudad! ");
		return new NPC(3, 3, 7, 2);
	}

}
