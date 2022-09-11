package view;
import controller.threadSapos;
public class main {

	public static void main(String[] args) {
	
	

		for (int i = 0; i < 5; i++) {
			threadSapos sapo = new threadSapos();
			sapo.start();
		}

	}
	
}

