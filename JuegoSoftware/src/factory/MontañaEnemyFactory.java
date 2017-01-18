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
