package factory;

import fighter.NPC;

public class Monta�aWarrior implements Warrior{
public NPC generate(int lvl) {
		
		System.out.println("Wow! aparecio un warrior de las Monta�as! ");
		return new NPC( lvl, "warrior");
	}



}
