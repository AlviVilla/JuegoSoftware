package event;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import event.Enemy;
import event.Event;
import factory.CiudadEnemyFactory;
import factory.DesiertoEnemyFactory;
import factory.EnemyGenerator;
import factory.MontañaEnemyFactory;
import fighter.NPC;
import game.Game;

public class Map implements Event {

	Random randomMap = new Random(System.currentTimeMillis());
	
	

	@Override
	public void execute(Game game) {
		
		int rand = randomMap.nextInt(3);
		
		if(rand==0)
			game.factory = new EnemyGenerator(new CiudadEnemyFactory());
		if(rand==1)
			game.factory = new EnemyGenerator(new DesiertoEnemyFactory());
		if(rand==2)
			game.factory = new EnemyGenerator(new MontañaEnemyFactory());
		
		addEnemies(game);
	}

	private void addEnemies(Game game){
		
		//Logica para nivel
		game.eventos.push(new Enemy());
		game.eventos.push(new Enemy());
		game.eventos.push(new Enemy());
		
	}
	

}
