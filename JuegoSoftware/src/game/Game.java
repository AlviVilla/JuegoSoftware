package game;

import java.util.Random;
import java.util.Stack;

import calculator.CombatCalculator;
import event.Event;
import event.Map;
import event.Start;
import factory.EnemyGenerator;
import factory.MapEnemyFactory;
import fighter.Player;

public class Game {
	public Player player;
	public Random ramdomSeed;

	//public GamePhase gamePhase;
	public Stack <Event> eventos;
	
	public CombatCalculator calculator;
	//public int map;
	public int level;
	public EnemyGenerator factory;
	public PlayerController playerController;
	
	public Game(){
		calculator = CombatCalculator.getInstace();
		ramdomSeed = new Random(System.currentTimeMillis());
		eventos = new Stack<Event>();
		eventos.add(new Start());
		playerController = new PlayerController();
		
	}
	

}
