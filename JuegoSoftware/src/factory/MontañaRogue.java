package factory;

import fighter.NPC;

public class MontañaRogue implements Rogue{

public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un rogue de las Montañas! ");
		return new NPC(lvl, "rogue");
	}


}
