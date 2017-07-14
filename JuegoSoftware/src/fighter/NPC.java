package fighter;

import java.util.Random;

import game.Game;
import strategy.Agressive;
import strategy.Defensive;
import strategy.Normal;
import strategy.Strategy;

public class NPC extends Fighter{
	Random randomStrategy	 = new Random(System.currentTimeMillis());
	public NPC(int lvl){
		super.stats = new Stats(lvl);
		int rand = randomStrategy.nextInt(3);
		
		if(rand==0)
			super.strategy = new Normal();
		if(rand==1)
			super.strategy = new Agressive();
		if(rand==2)
			super.strategy = new Defensive();
		
	}
}
