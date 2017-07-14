package game;

import java.util.Scanner;

import ataques.MageSpecial;
import ataques.RougeSpecial;
import ataques.Template;
import ataques.WarriorSpecial;
import calculator.CombatCalculator;
import decorador.Defensivo;
import decorador.Normalucho;
import decorador.Poderoso;
import efectos.AplicarCongelado;
import efectos.AplicarVeneno;
import efectos.BuffarDefensa;
import efectos.Neutro;
import fighter.Fighter;
import fighter.Player;
import strategy.Agressive;
import strategy.Defensive;
import strategy.Normal;


public class PlayerController {
	
	public void combatAction(Fighter player, CombatCalculator calculator, Fighter enemy){
		input: while(true){
		System.out.println("Que quieres hacer?: ");
		System.out.println("");
		System.out.println("1] Ataque normal		2] Ataque Especial");
		System.out.println("3] Cambiar Estrategia			4] ");
		
		
		
		if(player.strategy.getStrategy()=="defensiva")
			player = new Defensivo(player);
		else if(player.strategy.getStrategy()=="agresiva")
			player = new Poderoso(player);
		else 
			player = new Normalucho(player);
		
		System.out.println(player.strategy.getStrategy());
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1:
			player.efecto = new Neutro();
			player.template.normalAttack();
			calculator.resolveTurn(player, enemy);
			player.getDecorador();
			break input;
			
		case 2:
			if(player.getMana() <10){
				System.out.println("No hay suficiente mana");
				break input;
			}
			else{
				if(player.tipo=="mago"){
					player.template.chooseAttack();
					player.efecto.onHit(enemy);
				}
				else if(player.tipo=="rogue"){
					player.template.chooseAttack();
					player.efecto.onHit(enemy);
					
				}
				else if(player.tipo=="warrior"){
					player.template.chooseAttack();
					player.efecto.onCast(player);	
					
				}
				calculator.resolveTurn(player, enemy);
				player.getDecorador();
				break input;
		}
		case 3:
			decideStrategy(player);
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
		}
	}
	
	public Player createPlayer(){
		int x = 15;
		int aux;
		Player player = new Player();
		System.out.println("Hola aventurero! Que clase deseas ser?");
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		switch (z) {
		case 1:
			System.out.println("Enhorabuena eres un mago!");
			player.tipo="mago";
			player.template = new MageSpecial(player);
			break;
		case 2:
			System.out.println("Enhorabuena eres un rogue!");
			player.tipo="rogue";
			player.template = new RougeSpecial(player);
			break;
		case 3:
			System.out.println("Enhorabuena eres un warrior!");
			player.tipo="warrior";
			player.template = new WarriorSpecial(player);
			break;
		default: 
			System.out.println("opcion no valida");
		}
		System.out.println("Tus estadisticas iniciales son: ");
		printStats(player);
		System.out.println("Tienes " + x + " puntos extra ");
		System.out.println("Cuantos puntos quieres dedicar al ataque");
		aux = inputStat(x);
		player.stats.attack += aux;
		x -= aux;
		System.out.println("Tienes " + x + " puntos extra ");

		System.out.println("Cuantos puntos quieres dedicar al defensa");
		aux = inputStat(x);
		player.stats.defense += aux;
		x -= aux;
		System.out.println("Tienes " + x + " puntos extra ");
		System.out.println("Cuantos puntos quieres dedicar al intelecto");
		aux = inputStat(x);
		player.stats.intelligence += aux;
		x -= aux;
		System.out.println("Tienes " + x + " puntos extra ");
		System.out.println("Cuantos puntos quieres dedicar a la velocidad");
		aux = inputStat(x);
		player.stats.speed += aux;
		x -= aux;
		
		return player;
	}
	
	private int inputStat(int max){
		Scanner sc = new Scanner(System.in);
		while(true){
			int x = sc.nextInt();
			if(x <= max)
				return x;
			System.out.println("Introduce un numero menor  o igual al numero de puntos restantes: " + max);
		}
		
		
	}
	public void decideStrategy(Fighter fighter){
		
		System.out.println("Que quieres hacer?: ");
		System.out.println("");
		System.out.println("1] Normal		2] Ofensiva");
		System.out.println("3] Defensiva		");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		switch (x) {
		case 1:
			fighter.strategy = new Normal();
			break;
		case 2:
			fighter.strategy = new Agressive();
			break ;
		case 3:
			fighter.strategy = new Defensive();
			break;
		default:
			System.out.println("Opcion no valida");
			break;
		}
	}
	public void printStats(Fighter fighter){
		System.out.println("Ataque: " + fighter.stats.attack);
		System.out.println("Defensa: " + fighter.stats.defense);
		System.out.println("Max HP: " + fighter.stats.maxHealth);
		System.out.println("Max mana: " + fighter.stats.maxMana);
		System.out.println("Inteligencia: " + fighter.stats.intelligence);
		System.out.println("Speed: " + fighter.stats.speed);
		

	}
	
	
}
