package event;

import java.util.Random;
import java.util.Scanner;

import factory.CiudadEnemyFactory;
import factory.DesiertoEnemyFactory;
import factory.EnemyGenerator;
import factory.MontañaEnemyFactory;
import fighter.Fighter;
import game.Game;

public class Enemy implements Event {

	@Override
	public void execute(Game game) {
		
				
		int rand = game.ramdomSeed.nextInt(3);
		Fighter enemy = null;
		
		switch(rand){
		case 1:
			enemy = game.factory.generateMage(game.level);
			break;
		case 2: 
			enemy = game.factory.generateRogue(game.level);
			break;
		default:
			enemy = game.factory.generateWarrior(game.level);
			break;
		}
		
		System.out.println(enemy.toString());

		System.out.println(game.player.toString());
		while(enemy.getHealth()>0 && game.player.getHealth() > 0){
			
			
			
					 
			System.out.println("Que quieres hacer?: ");
			System.out.println("");
			System.out.println("0] Attack			2] Manage Inventory");
			System.out.println("1] Defend			3] Run!");
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			if (x == 0) {
				System.out.println(game.player.toString());
				System.out.println(enemy.toString());

				game.calculator.resolveTurn(game.player, enemy);
			}
				System.out.println("Tu vida: "+game.player.getHealth());

				System.out.println("Vida de tu enemigo: "+enemy.getHealth());
				}
				System.out.println("QUE BATALLON");
			
			
		
		
	}
	// TODO Auto-generated method stub

}
