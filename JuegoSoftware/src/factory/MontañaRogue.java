package factory;

import fighter.NPC;

public class Monta�aRogue implements Rogue{

public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un rogue de las Monta�as! ");
		return new NPC(lvl, "rogue");
	}


}
