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
	public NPC generateMage() {
		// TODO Auto-generated method stub
		return mage.generate();

	}

	@Override
	public NPC generateWarrior() {
		return warrior.generate();
		// TODO Auto-generated method stub
	}

	@Override
	public NPC generateRogue() {
		// TODO Auto-generated method stub
		return rogue.generate();
	}
}
