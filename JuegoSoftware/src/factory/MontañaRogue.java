package factory;

import fighter.NPC;

public class Monta�aRogue implements Rogue{

public NPC generate() {
		
		System.out.println("Wow! aparecio un rogue de las Monta�as! ");
		return new NPC(4, 5, 0, 6);
	}


}
