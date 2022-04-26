package superLeo.jeu;

public class Chrono implements Runnable{
	private final int PAUSE = 0;  

	@Override
	public void run() {
		
		while(true){
			 
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {} 
		}
		
	}

}
