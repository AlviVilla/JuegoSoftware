package event;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;


import decorador.Defensivo;
import decorador.Normalucho;
import decorador.Poderoso;
import event.Event;
import factory.CiudadEnemyFactory;
import factory.DesiertoEnemyFactory;
import factory.EnemyGenerator;
import factory.MontañaEnemyFactory;
import fighter.Fighter;
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

		NPC mago= game.factory.generateMage(game.level);
		añadirCondimentos(mago,game);

		NPC rogue= game.factory.generateRogue(game.level);
		añadirCondimentos(rogue,game);

		NPC warrior= game.factory.generateWarrior(game.level);
		añadirCondimentos(warrior,game);
		
		game.eventos.push(new Fight(mago));
		game.eventos.push(new Fight(rogue));
		game.eventos.push(new Fight(warrior));
	}
	
	private void añadirCondimentos(Fighter npc, Game game){
		if(npc.strategy.getStrategy() == "normal")
			npc= new Normalucho(npc);
		if(npc.strategy.getStrategy()== "agresiva")
			npc=new Poderoso(npc);
		if(npc.strategy.getStrategy()== "defensiva")
			npc=new Defensivo(npc);
	}
	

}
