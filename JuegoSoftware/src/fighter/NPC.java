package fighter;

import java.util.Random;

import game.Game;
import strategy.Agressive;
import strategy.Defensive;
import strategy.Normal;
import strategy.Strategy;

public class NPC extends Fighter{
	Random randomStrategy	 = new Random(System.currentTimeMillis());
	public NPC(int lvl, String tipo){
		
		super.stats = new Stats(lvl);
		System.out.println(stats.attack+" "+stats.defense+" "+stats.mana);
		int rand = randomStrategy.nextInt(3);
		super.tipo=tipo;
		if(rand==0)
			super.strategy = new Normal();
		if(rand==1)
			super.strategy = new Agressive();
		if(rand==2)
			super.strategy = new Defensive();
		}
	public String getDecorador(){
		return super.getDecorador();
	}
}
