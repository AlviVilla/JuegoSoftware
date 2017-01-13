package factory;

import fighter.NPC;

public class MontañaEnemyFactory implements MapEnemyFactory{
	MontañaMage mage;
	MontañaWarrior warrior;
	MontañaRogue rogue;

	public MontañaEnemyFactory() {

		mage = new MontañaMage();
		warrior = new MontañaWarrior();
		rogue = new MontañaRogue();

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
