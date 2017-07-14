package factory;

import fighter.NPC;

public class CiudadWarrior implements Warrior{

public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un warrior de Ciudad! ");
		return new NPC(lvl, "warrior");
	}

}
