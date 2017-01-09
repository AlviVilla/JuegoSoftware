package fighter;

public class NPC extends Fighter{
	
	public NPC(int Attack,int Defense, int Intelligence, int Speed){
		setAttack(Attack);
		setDefense(Defense);
		setIntelligence(Intelligence);
		setSpeed(Speed);
		System.out.println("Nuevo enemigo creado: ataque: "+getAttack()+" Defensa: "+getDefense()+" Inteligencia: "+getIntelligence());
		
	}

}
