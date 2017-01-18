package factory;

import fighter.NPC;

public interface MapEnemyFactory {

	NPC generateMage(int lvl);

	NPC generateWarrior(int lvl);

	NPC generateRogue(int lvl);

}
