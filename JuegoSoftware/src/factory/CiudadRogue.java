package factory;

import fighter.NPC;

public class CiudadRogue implements Rogue{


	public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un rogue de Ciudad! ");
		return new NPC(lvl, "rogue");
	}


}
