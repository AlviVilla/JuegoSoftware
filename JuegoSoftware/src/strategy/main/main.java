package main;

import game.phase.Map;
import game.phase.Start;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("bienvenido");
		Game game = new Game();
		game.gamePhase = new Start();
		game.gamePhase.execute(game);
		game.gamePhase = new Map();
		game.gamePhase.execute(game);
	}

}
