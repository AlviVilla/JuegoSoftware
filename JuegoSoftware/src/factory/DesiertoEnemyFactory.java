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
	public NPC generateMage() {
		// TODO Auto-generated method stub
		return 	mage.generate();


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
