package factory;

import fighter.NPC;

public class EnemyGenerator {
	private MapEnemyFactory MEF;
	

	public EnemyGenerator(MapEnemyFactory MEF) {
		this.MEF = MEF;

	}

	public NPC generateMage(int lvl) {
		// TODO Auto-generated method stub
		return MEF.generateMage(lvl);
		
	}

	public NPC generateWarrior(int lvl) {
		// TODO Auto-generated method stub
		return MEF.generateWarrior(lvl);
		
	}

	public NPC generateRogue(int lvl) {
		// TODO Auto-generated method stub
		return MEF.generateRogue(lvl);
			
	}

}
