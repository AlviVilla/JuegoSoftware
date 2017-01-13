package factory;

import fighter.NPC;

public class DesiertoRogue implements Rogue{

public NPC generate() {
		
		System.out.println("Wow! aparecio un rogue del Desierto! ");
		return new NPC(5, 3, 0, 7);
	}


}
