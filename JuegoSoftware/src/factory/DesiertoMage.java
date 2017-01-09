package factory;

import fighter.NPC;

public class DesiertoMage implements Mage{

	public NPC generate() {
		
		System.out.println("Wow! aparecio un mago del Desierto! ");
		return new NPC(1, 2, 7, 5);
	}

}
