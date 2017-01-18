package factory;

import fighter.NPC;

public class DesiertoMage implements Mage{

	public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un mago del Desierto! ");
		return new NPC(lvl);
	}

}
