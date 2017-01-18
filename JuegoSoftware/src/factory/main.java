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
		mago= GUI.generateMage(1);
		warrior= GUI.generateWarrior(1);
		rogue= GUI.generateRogue(1);
		GUI = new EnemyGenerator(new DesiertoEnemyFactory());

		warrior= GUI.generateWarrior(1);
		mago= GUI.generateMage(1);
		rogue= GUI.generateRogue(1);
		GUI = new EnemyGenerator(new CiudadEnemyFactory());

		warrior= GUI.generateWarrior(1);
		mago= GUI.generateMage(1);
		rogue= GUI.generateRogue(1);
			
	}

}
