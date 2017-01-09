package factory;

import fighter.NPC;

public class DesiertoWarrior implements Warrior{
public NPC generate() {
		
		System.out.println("Wow! aparecio un warrior del Desierto! ");
		return new NPC(3, 7, 0, 5);
	}

}
