package accion;

public class Accion {

	Accion attack;
	Accion defend;
	
	Accion accion;

	int decision;

	public Accion(int decision) {
		this.decision = decision;
	}
	public Accion(){
		
	}

	public Accion getAccion() {
		if (decision == 0) {
			accion = new Attack();
			
		} else if (decision == 1) {
			accion = new Defend();
			
		}
		return accion;

	}

}
