package event;
import java.util.Scanner;

import fighter.Player;
import game.Game;

public class Start implements Event {

	public Start() {

	}

	@Override
	public void execute(Game game) {
		

		
		Player player = game.playerController.createPlayer();
		game.player = player;
		
		game.eventos.add(new Map());

	}

}
