package game.phase;

import main.Game;

public class EndFight implements GamePhase{

	@Override
	public void execute(Game game) {
		
		System.out.println("");
		System.out.println("");
		System.out.println("");

		System.out.println("Ha sido una dura batalla, me parece que va siendo hora de volver al mapa lol");
		// TODO Auto-generated method stub
		game.gamePhase= new Map();
		game.gamePhase.execute(game);
		
	}

}
