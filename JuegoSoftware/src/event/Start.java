package event;
import java.util.Scanner;

import fighter.Player;
import game.Game;

public class Start implements Event {

	public Start() {

	}

	@Override
	public void execute(Game game) {
		int x, y, z, a;
		game.level=1;
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

		
		Player player = new Player();
		game.player = player;
		game.eventos.add(new Map());

	}

}
