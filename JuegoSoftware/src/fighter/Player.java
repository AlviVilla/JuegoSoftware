package fighter;

import strategy.Normal;

public class Player extends Fighter {
 

	public Player(){
		super.stats = new Stats(2);
		super.strategy = new Normal();
	}

	
}
