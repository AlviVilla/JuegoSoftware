package factory;

import fighter.NPC;

public class Monta�aMage implements Mage{


	public NPC generate() {
		
		System.out.println("Wow! aparecio un mago de las Monta�as! ");
		return new NPC(1, 5, 5, 4);
	}


}
