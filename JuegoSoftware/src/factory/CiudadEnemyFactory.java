package factory;

import fighter.NPC;

public class CiudadEnemyFactory implements MapEnemyFactory{
	CiudadMage mage;
	CiudadWarrior warrior;
	CiudadRogue rogue;

	public CiudadEnemyFactory() {
		mage = new CiudadMage();
		warrior = new CiudadWarrior();
		rogue = new CiudadRogue();
		

	}

	@Override
	public NPC generateMage(int lvl) {
		// TODO Auto-generated method stub
		return  mage.generate(lvl);

	}

	@Override
	public NPC generateWarrior(int lvl) {
		return warrior.generate(lvl);
		// TODO Auto-generated method stub
	}

	@Override
	public NPC generateRogue(int lvl) {
		// TODO Auto-generated method stub
		return rogue.generate(lvl);
	}
}
