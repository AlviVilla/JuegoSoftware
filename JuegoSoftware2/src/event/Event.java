package event;

import java.util.Random;

import factory.CiudadEnemyFactory;
import factory.DesiertoEnemyFactory;
import factory.EnemyGenerator;
import factory.Monta�aEnemyFactory;
import game.phase.Fight;
import main.Game;

public interface Event {

	public void execute(Game game);
}