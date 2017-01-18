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
	public NPC generateMage(int lvl) {
		// TODO Auto-generated method stub
		return mage.generate(lvl);

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
