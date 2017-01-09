package factory;

import fighter.NPC;

public class CiudadWarrior implements Warrior{

public NPC generate() {
		
		System.out.println("Wow! aparecio un warrior de Ciudad! ");
		return new NPC(8, 7, 0, 0);
	}

}
