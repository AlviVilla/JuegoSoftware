package strategy;

public class Agressive implements Strategy {

	@Override
	public double getAttackFactor() {
		// TODO Auto-generated method stub
		return 1.25;
	}

	@Override
	public double getDefenseFactor() {
		// TODO Auto-generated method stub
		return 0.75;
	}
	
	@Override
	public String getStrategy() {
		// TODO Auto-generated method stub
		return "agresiva";
	}


}
