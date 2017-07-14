package game;

import java.util.Scanner;

import fighter.Player;

public class PlayerController {
	
	public void combatAction(Player player){
		input: while(true){
		System.out.println("Que quieres hacer?: ");
		System.out.println("");
		System.out.println("1] Ataque normal		2] Ataque Especial");
		System.out.println("3] Cambiar Estrategia			4] ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1:
			player.
			break input;
		case 2:
			
			break input;
		case 3:
			decideStrategy();
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
		}
	}
	
	public Player createPlayer(){
		
	}
	
	public void decideStrategy(){
		
		
		
	}
	
	
	
}
