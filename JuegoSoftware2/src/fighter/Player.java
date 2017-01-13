package fighter;

public class Player extends Fighter {
 
	
	public Player(int Attack,int Defense, int Intelligence, int Speed, int H){
		setAttack(Attack);
		setDefense(Defense);
		setIntelligence(Intelligence);
		setSpeed(Speed);
		setHealth(H);
		System.out.println("Nuevo jugador creado: ataque: "+getAttack()+" Defensa: "+getDefense() + " Inteligencia: "+getIntelligence()+" Agilidad: "+getSpeed());
		
	}

	
}
