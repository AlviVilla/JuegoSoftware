package fighter;

import game.Game;
import strategy.Strategy;

public class NPC extends Fighter{
	public Strategy strategy;
	public NPC(int lvl){
		super.stats = new Stats(lvl);
	}

}
