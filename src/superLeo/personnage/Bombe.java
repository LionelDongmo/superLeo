package superLeo.personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

import superlionel.objet.Objets;

public class Bombe extends personnage implements Runnable{
	
	private ImageIcon icoBombe;
	private Image imgBombe;
	
	private final int PAUSE = 15;
	private int dxBombe; // pas de deplacement de la bombe
	
//****************CONSTRUCTEUR***********//
	public Bombe(int x, int y){
		
		super(x, y, 50, 60);
		super.setVersdr(true);
	    super.setMarche(true);
		this.dxBombe = 1;
		
		this.icoBombe = new ImageIcon(getClass().getResource("/images/bombe-debout-avant-A.png"));
		this.imgBombe = this.icoBombe.getImage();
		
		Thread chronoBombe = new Thread(this);
		chronoBombe.start();

	}

	
//***************GETTERS***************** //

	public Image getImgBombe() {return imgBombe;}


//****************METHODES****************//

public void bouge(){ //deplacement de le Bombe
	if(super.isVersdr() == true){this.dxBombe = 1;}
	else{this.dxBombe = -1;}
    super.setX(super.getX() + this.dxBombe);
}


@Override
public void run() {
	try{Thread.sleep(20);}
	catch(InterruptedException e){}
	
	while(true){
		if(this.vivant == true){
		this.bouge();
		try{Thread.sleep(PAUSE);}
		catch(InterruptedException e){}
		}	
	 }
  }

public	void contact(Objets objet){
	if(super.contactAvant(objet) == true && this.isVersdr() == true){
		super.setVersdr(false);
		this.dxBombe = -1;
	}else if(super.contactRetour(objet) == true && this.isVersdr() == false){
		super.setVersdr(true);
		this.dxBombe = 1;
	}
  }
public	void contact(personnage personne){
	if(super.contactAvant(personne) == true && this.isVersdr() == true){
		super.setVersdr(false);
		this.dxBombe = -1;
	}else if(super.contactRetour(personne) == true && this.isVersdr() == false){
		super.setVersdr(true);
		this.dxBombe = 1;
	}
  }
public Image meurt(){
	
	ImageIcon icon;
	Image img;
	
	if(this.isVersdr() == true){
		icon = new ImageIcon(getClass().getResource("/images/bombe-avant-D.png"));
	    img = icon.getImage();
	}else{
		icon = new ImageIcon(getClass().getResource("/images/bombe-retour-D.png"));
	    img = icon.getImage();
	}
	return img;
}

}