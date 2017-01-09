package factory;

import fighter.NPC;

public class MontañaWarrior implements Warrior{
public NPC generate() {
		
		System.out.println("Wow! aparecio un warrior de las Montañas! ");
		return new NPC(2, 13, 0, 0);
	}

}
