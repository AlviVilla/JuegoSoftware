package event;

import java.util.Scanner;

import calculator.CombatCalculator;
import fighter.Fighter;
import game.Game;
import game.PlayerController;

public class Fight implements Event {
	
	Fighter enemigo;
	CombatCalculator calculator;

	public Fight(Fighter enemigo) {
		
		this.enemigo = enemigo;

	}

	@Override
	public void execute(Game game) {
		//Rand y elegimos un enemigo
		
		CombatCalculator calculadora=game.calculator;
		PlayerController controller = game.playerController;
		System.out.println(game.player.stats.attack);
		controller.combatAction(game.player, calculadora, enemigo);
		}
	}
		/*
		 * for (int i = 0; enemigo.getHealth() <= 0 || game.player.getHealth()
		 * <= 0; i++) { System.out.println("Ronda de combate numero " + i);
		 
		System.out.println("Peta aqui?");
		while (game.player.getHealth()>0 && this.enemigo.getHealth()>0) {
		System.out.println("Que quieres hacer?: ");
		System.out.println("");
		System.out.println("0] Attack			2] Manage Inventory");
		System.out.println("1] Defend			3] Run!");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
			if (x == 0) {
				System.out.println(game.player.toString());
				System.out.println(enemigo.toString());

				game.calculator.resolveTurn(game.player, enemigo);
			}
			System.out.println("Tu vida: "+game.player.getHealth());

			System.out.println("Vida de tu enemigo: "+enemigo.getHealth());
		}
		System.out.println("QUE BATALLON");
		

		// }

	}

}

*/