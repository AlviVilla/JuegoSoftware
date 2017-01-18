package factory;

import fighter.NPC;

public class DesiertoEnemyFactory implements MapEnemyFactory{
	DesiertoMage mage;
	DesiertoWarrior warrior;
	DesiertoRogue rogue;

	public DesiertoEnemyFactory() {

		mage = new DesiertoMage();
		warrior = new DesiertoWarrior();
		rogue = new DesiertoRogue();

	}

	@Override
	public NPC generateMage(int lvl) {
		// TODO Auto-generated method stub
		return 	mage.generate(lvl);


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
