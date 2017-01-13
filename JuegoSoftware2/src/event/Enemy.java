package event;

import java.util.Random;

import factory.CiudadEnemyFactory;
import factory.DesiertoEnemyFactory;
import factory.EnemyGenerator;
import factory.MontañaEnemyFactory;
import game.phase.Fight;
import main.Game;

public class Enemy implements Event {
	Random randomMap = new Random(System.currentTimeMillis());

	@Override
	public void execute(Game game) {
		int rand = randomMap.nextInt(3);
		if (game.map == 0) {
			game.GUI = new EnemyGenerator(new CiudadEnemyFactory());
			if (rand == 0) {
				game.gamePhase = new Fight(game.GUI.generateMage());
				game.gamePhase.execute(game);
			}
			if (rand == 1) {
				game.gamePhase = new Fight(game.GUI.generateWarrior());
				game.gamePhase.execute(game);
			}
			if (rand == 2) {

				game.gamePhase = new Fight(game.GUI.generateRogue());
				game.gamePhase.execute(game);

			}
		}
		if (game.map == 1) {
			game.GUI = new EnemyGenerator(new DesiertoEnemyFactory());
			if (rand == 0) {
				game.gamePhase = new Fight(game.GUI.generateMage());
				game.gamePhase.execute(game);
			}
			if (rand == 1) {
				game.gamePhase = new Fight(game.GUI.generateWarrior());
				game.gamePhase.execute(game);
			}
			if (rand == 2) {

				game.gamePhase = new Fight(game.GUI.generateRogue());
				game.gamePhase.execute(game);

			}
		}
		if (game.map == 2) {
			game.GUI = new EnemyGenerator(new MontañaEnemyFactory());
			if (rand == 0) {
				game.gamePhase = new Fight(game.GUI.generateMage());
				game.gamePhase.execute(game);
			}
			if (rand == 1) {
				game.gamePhase = new Fight(game.GUI.generateWarrior());
				game.gamePhase.execute(game);
			}
			if (rand == 2) {

				game.gamePhase = new Fight(game.GUI.generateRogue());
				game.gamePhase.execute(game);

			}
		}
	}
	// TODO Auto-generated method stub

}
