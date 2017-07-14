package factory;

import fighter.NPC;

public class MontañaWarrior implements Warrior{
public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un warrior de las Montañas! ");
		return new NPC( lvl, "warrior");
	}



}
