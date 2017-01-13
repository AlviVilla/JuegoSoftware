package factory;

import fighter.NPC;

public class MontañaMage implements Mage{


	public NPC generate() {
		
		System.out.println("Wow! aparecio un mago de las Montañas! ");
		return new NPC(1, 5, 5, 4);
	}


}
