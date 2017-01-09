package factory;

import fighter.NPC;

public interface MapEnemyFactory {

	NPC generateMage();

	NPC generateWarrior();

	NPC generateRogue();

}
