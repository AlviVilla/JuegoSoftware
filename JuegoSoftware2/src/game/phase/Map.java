package game.phase;

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
import main.Game;

public class Map implements GamePhase {
Stack<Event> eventos;
	Random randomMap = new Random(System.currentTimeMillis());
	
	public Map(){
		
	}

	@Override
	public void execute(Game game) {
		// TODO Auto-generated method stub
		game.map = randomMap.nextInt(3);
		if(game.map==0)
			Ciudad(game);
		if(game.map==1)
			Desierto(game);
		if(game.map==2)
			Montaña(game);
		

	}

	public void Ciudad(Game game) {
		System.out.println("Estas en la Ciudad ");
		Event evento=new Enemy();
		evento.execute(game);
		
		//game.GUI = new EnemyGenerator(new CiudadEnemyFactory());
		//game.gamePhase = new Fight(game.GUI.generateMage());
		//game.gamePhase.execute(game);
	}

	public void Desierto(Game game) {
		System.out.println("Estas en el Desierto ");
		Event evento=new Enemy();
		evento.execute(game);
		
	}
	public void Montaña(Game game) {
		System.out.println("Estas por aqui en un sitio de las montañas");
		
		
		Event evento=new Enemy();
		evento.execute(game);
		
	}

}
