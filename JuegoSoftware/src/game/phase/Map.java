package game.phase;

import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

import event.Event;
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
		int map = randomMap.nextInt(2);
		if(map==0)
			mapaUno(game);
		if(map==1)
			mapaDos(game);

	}

	public void mapaUno(Game game) {
		System.out.println("Estas en el mapa1 ");

		System.out.println("Te has encontrado un enemigo, A LUCHAR PERRAS! ");
		int x = 2;
		int y = 3;
		int z = 4;
		int a=3;
		NPC enemigo = new NPC(x, y,z,a);
		game.gamePhase = new Fight(enemigo);
		game.gamePhase.execute(game);
	}

	public void mapaDos(Game game) {
		System.out.println("Estas por aqui en un sitio del mapaDos ");
		System.out.println("Ahora hacemos un enemigo y nos pegamos o k lol k?");
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce los atributos de tu enemigo ");
		System.out.print("Attack: ");
		x = sc.nextInt();
		System.out.print("Defense: ");
		y = sc.nextInt();
		
		NPC enemigo = new NPC(x, y,0,4);
		game.gamePhase = new Fight(enemigo);
		game.gamePhase.execute(game);
		
	}

}
