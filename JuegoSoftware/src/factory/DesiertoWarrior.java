package factory;

import fighter.NPC;

public class DesiertoWarrior implements Warrior{
public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un warrior del Desierto! ");
		return new NPC(lvl, "warrior");
	}

}
