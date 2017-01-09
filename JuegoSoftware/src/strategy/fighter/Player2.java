package fighter;

public class Player2 extends Fighter {
 
	
	public Player2(int Attack,int Defense, int Intelligence, int Speed, int H){
		setAttack(Attack);
		setDefense(Defense);
		setIntelligence(Intelligence);
		setSpeed(Speed);
		setHealth(H);
		System.out.println("Nuevo jugador creado: ataque: "+getAttack()+" Defensa: "+getDefense() + " Inteligencia: "+getIntelligence()+" Agilidad: "+getSpeed());
		
	}

	
}
