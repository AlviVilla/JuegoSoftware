package fighter;

public class NPC extends Fighter{
	
	public NPC(int Attack,int Defense, int Intelligence, int Speed){
		setAttack(Attack);
		setDefense(Defense);
		setIntelligence(Intelligence);
		setSpeed(Speed);
		setHealth(15);//por probar
		System.out.println("Nuevo enemigo creado: ataque: "+getAttack()+" Defensa: "+getDefense()+" Inteligencia: "+getIntelligence());
		
	}

}
