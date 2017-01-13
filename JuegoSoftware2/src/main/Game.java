package main;

import calculator.CombatCalculator;
import factory.EnemyGenerator;
import fighter.Player;
import game.phase.GamePhase;

public class Game {
	public Player player;
	public GamePhase gamePhase; 
	public CombatCalculator calculator;
	public int map;
	public int level;
	public EnemyGenerator GUI;
	
	
	public Game(){
		calculator = CombatCalculator.getInstace();
		
	}
	

}
