package superLeo.jeu;

import java.awt.event.*;

import superlionel.audio.Audio;

public class Clavier implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		if(Main.scene.lionel.isVivant() == true){
		 if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			if(Main.scene.getxPos() == -1){
				Main.scene.setxPos(1);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(850);
			}
			
		Main.scene.lionel.setMarche(true);
		Main.scene.lionel.setVersdr(true);
		Main.scene.setDx(2);
		
		}else if(e.getKeyCode() == KeyEvent.VK_LEFT){
			
			if(Main.scene.getxPos() == 5701){
				Main.scene.setxPos(5700);
				Main.scene.setxFond1(-50);
				Main.scene.setxFond2(850);
			}   
			Main.scene.lionel.setMarche(true);
			Main.scene.lionel.setVersdr(false);
		    Main.scene.setDx(-2);
		}
		
		//lionel saute
		
		if(e.getKeyCode() == KeyEvent.VK_SPACE){
			Main.scene.lionel.setSaut(true);
			Audio.playSound("/Audio/saut.wav");
		}
		
		if(Main.scene.lionel.getY() < 375 ){
		  if(e.getKeyCode() == KeyEvent.VK_DOWN){
			Main.scene.lionel.setY(Main.scene.lionel.getY() + 5);}
		}
	 }		
  }

	@Override
	public void keyReleased(KeyEvent e) {
		Main.scene.lionel.setMarche(false);
		Main.scene.setDx(0);
		}

	@Override
	public void keyTyped(KeyEvent e) {}

}
