package game;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido a nombre por decidir");
		System.out.println("Comenzando...");
		
		Game game = new Game();
		while(!game.eventos.isEmpty()){
			
			game.eventos.pop().execute(game);
		}
	}

}
