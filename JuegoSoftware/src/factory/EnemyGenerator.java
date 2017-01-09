package factory;

import fighter.NPC;

public class EnemyGenerator {
	private MapEnemyFactory MEF;
	NPC warrior;
	NPC mage;
	NPC rogue;

	public EnemyGenerator(MapEnemyFactory MEF) {
		this.MEF = MEF;

	}

	public NPC generateMage() {
		// TODO Auto-generated method stub
		this.mage = MEF.generateMage();
		return mage;
	}

	public NPC generateWarrior() {
		// TODO Auto-generated method stub
		MEF.generateWarrior();
		return warrior;
	}

	public NPC generateRogue() {
		// TODO Auto-generated method stub
		MEF.generateRogue();
		return rogue;	
	}

}
