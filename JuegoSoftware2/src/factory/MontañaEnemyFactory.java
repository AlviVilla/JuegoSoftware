package factory;

import fighter.NPC;

public class Monta�aEnemyFactory implements MapEnemyFactory{
	Monta�aMage mage;
	Monta�aWarrior warrior;
	Monta�aRogue rogue;

	public Monta�aEnemyFactory() {

		mage = new Monta�aMage();
		warrior = new Monta�aWarrior();
		rogue = new Monta�aRogue();

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
