package controller;

public class Controller03 {
	
	public Controller03() {
		super();
	}

	public int Fatorial (int n) {
		
		/*
		 * Condição de parada: se for igual a 0, retornar 1
		 */
		
		if (n == 0 || n == 1) {
			return 1;
			
		} else {
			return n * Fatorial(n-1);
		}
	}
}
