package factory;

import fighter.NPC;

public class MontaņaMage implements Mage{


	public NPC generate() {
		
		System.out.println("Wow! aparecio un mago de las Montaņas! ");
		return new NPC(1, 5, 5, 4);
	}


}
