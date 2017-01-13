package factory;

import fighter.NPC;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome");

NPC warrior;
NPC mago;
NPC rogue;
		EnemyGenerator GUI = new EnemyGenerator(new MontañaEnemyFactory());
		mago= GUI.generateMage();
		warrior= GUI.generateWarrior();
		rogue= GUI.generateRogue();
		GUI = new EnemyGenerator(new DesiertoEnemyFactory());

		warrior= GUI.generateWarrior();
		mago= GUI.generateMage();
		rogue= GUI.generateRogue();
		GUI = new EnemyGenerator(new CiudadEnemyFactory());

		warrior= GUI.generateWarrior();
		mago= GUI.generateMage();
		rogue= GUI.generateRogue();
			
	}

}
