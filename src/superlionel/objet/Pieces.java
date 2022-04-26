package superlionel.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Pieces extends Objets implements Runnable {
//************VARIABLE**********//
	private int compteur;
    private final int PAUSE = 15;
	//******************CONSTRUCTEUR*********************//
	public Pieces(int x, int y){
		super(x, y, 30, 30);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/piece-rect.png"));
		super.imgObjet = this.icoObjet.getImage();		
}
//*******METHODE*********//
public Image bouge(){    // Mouvement de la piece 
	ImageIcon ico;
	Image img;
	
	this.compteur++;
	if(this.compteur / 100 == 0){
		ico = new ImageIcon(getClass().getResource("/images/piece-rect.png"));
	    img = ico.getImage();
	}else{
		ico = new ImageIcon(getClass().getResource("/images/piece-vers.png"));
	    img = ico.getImage();
	}
	if(this.compteur == 200){this.compteur = 0;}
return img;		
	}
@Override
public void run() {
	try {
		Thread.sleep(20);}
	catch (InterruptedException e) {}
	
	while(true){
		this.bouge();
	  try {Thread.sleep(PAUSE);}
	  catch (InterruptedException e) {}
 }

}

}
