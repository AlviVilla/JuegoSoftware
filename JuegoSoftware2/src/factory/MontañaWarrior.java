package factory;

import fighter.NPC;

public class Monta�aWarrior implements Warrior{
public NPC generate() {
		
		System.out.println("Wow! aparecio un warrior de las Monta�as! ");
		return new NPC(2, 13, 0, 0);
	}

}
