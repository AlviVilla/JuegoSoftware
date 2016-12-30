package game.phase;

import java.util.Scanner;

import fighter.Player;
import main.Game;

public class Start implements GamePhase {

	public Start() {

	}

	@Override
	public void execute(Game game) {
		int x, y, z, a;
		int health = 1000;
		int contador= 15;
		Scanner sc = new Scanner(System.in);
		System.out.println("Tienes 15 puntos a repartir entre tus atributos de Fuerza, Defensa e Inteligencia. ");
		System.out.println("Introduce los atributos de tu guerrero");
		System.out.print("Attack: ");
		x = sc.nextInt();
		System.out.println("Te quedan "+(contador-x)+" puntos. ");
		System.out.print("Defense: ");
		y = sc.nextInt();
		System.out.println("Te quedan "+(contador-y-x)+" puntos. ");

		System.out.println("Intelligence: ");
		z=sc.nextInt();
		
		a = contador-y-x-z;
		System.out.println("Agilidad: ");

		
		Player player = new Player(x, y, z, a, health);
		game.player = player;
	}

}
