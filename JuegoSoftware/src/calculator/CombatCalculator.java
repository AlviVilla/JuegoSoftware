package calculator;

import fighter.Fighter;

public class CombatCalculator {
	
	private static CombatCalculator instance;
	
	private CombatCalculator(){
		
	}
	public static CombatCalculator getInstace(){
		
		if(instance == null)
			instance = new CombatCalculator();
		return instance;
	}

	public void resolveTurn(Fighter a , Fighter b){
		
		if(a.getSpeed() > b.getSpeed()){
			b.reciveDmg(calculateDmg(a.getAttack(),b.getDefense()));
			if(b.isAlive())
				a.reciveDmg(calculateDmg(b.getAttack(),a.getDefense()));
		}
		else {
				a.reciveDmg(calculateDmg(b.getAttack(),a.getDefense()));
				if(a.isAlive())
					b.reciveDmg(calculateDmg(a.getAttack(),b.getDefense()));
		}
		
	}
	private int calculateDmg(double a,double b){
		int dmg =(int) ((int) a-b);
		if (dmg <=0)
			dmg = 1;
		return dmg;
	}
	
}
