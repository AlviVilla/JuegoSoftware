package game;

import java.util.Scanner;

import efectos.Neutro;
import fighter.Fighter;
import fighter.Player;


public class PlayerController {
	
	public void combatAction(Fighter player){
		input: while(true){
		System.out.println("Que quieres hacer?: ");
		System.out.println("");
		System.out.println("1] Ataque normal		2] Ataque Especial");
		System.out.println("3] Cambiar Estrategia			4] ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1:
			player.efecto = new Neutro();
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
		
		Player player = new Player();
		
		return player;
	}
	
	public void decideStrategy(){
		
		
		
	}
	
	
	
}
