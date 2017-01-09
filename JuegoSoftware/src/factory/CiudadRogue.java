package factory;

import fighter.NPC;

public class CiudadRogue implements Rogue{


	public NPC generate() {
		
		System.out.println("Wow! aparecio un rogue de Ciudad! ");
		return new NPC(8, 0, 0, 7);
	}


}
