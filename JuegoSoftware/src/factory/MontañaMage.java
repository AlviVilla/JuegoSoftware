package factory;

import fighter.NPC;

public class Monta�aMage implements Mage{


	public NPC generate(int lvl) {
		
		NPC mago =new NPC(lvl);
		mago.stats.attack+=3;
		
		
		
		return mago;
	}


}
