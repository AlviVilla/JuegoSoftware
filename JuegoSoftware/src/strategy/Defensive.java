package strategy;

public class Defensive implements Strategy {

	@Override
	public double getAttackFactor() {
		// TODO Auto-generated method stub
		return 0.75;
	}

	@Override
	public double getDefenseFactor() {
		// TODO Auto-generated method stub
		return 1.25;
	}

}
