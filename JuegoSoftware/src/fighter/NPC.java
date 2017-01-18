package fighter;

import game.Game;

public class NPC extends Fighter{
	
	public NPC(int lvl){
		super.stats = new Stats(lvl);
	}

}
