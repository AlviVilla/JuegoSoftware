package factory;

import fighter.NPC;

public class MontañaRogue implements Rogue{

public NPC generate() {
		
		System.out.println("Wow! aparecio un rogue de las Montañas! ");
		return new NPC(4, 5, 0, 6);
	}


}
