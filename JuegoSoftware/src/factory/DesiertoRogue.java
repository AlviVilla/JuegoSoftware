package factory;

import fighter.NPC;

public class DesiertoRogue implements Rogue{

public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un rogue del Desierto! ");
		return new NPC(lvl);
	}


}
