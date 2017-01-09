package game.phase;

import java.util.Scanner;

import accion.Accion;
import fighter.Fighter;
import main.Game;

public class Fight implements GamePhase {
	Accion accion;
	Fighter enemigo;

	public Fight(Fighter enemigo) {
		this.enemigo = enemigo;
	}

	@Override
	public void execute(Game game) {
		/*for (int i = 0; enemigo.getHealth() <= 0 || game.player.getHealth() <= 0; i++) {
			System.out.println("Ronda de combate numero " + i);
			*/
			System.out.println("Que quieres hacer?: ");
			System.out.println("");
			System.out.println("0] Attack			2] Manage Inventory");
			System.out.println("1] Defend			3] Run!");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			accion = new Accion(x);
			accion.getAccion();
		//}
		game.gamePhase = new EndFight();
		game.gamePhase.execute(game);
	}

}
