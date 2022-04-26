package superLeo.personnage;
import java.awt.Image;

import javax.swing.*;

import superLeo.jeu.Main;
import superlionel.audio.Audio;
import superlionel.objet.Objets;
import superlionel.objet.Pieces;
public class Lionel extends personnage{

	private ImageIcon icoLeo;
	private Image imgLeo;
	private boolean saut;
	private int cptsaut;
	private int cptMort;
	
	public Lionel(int x, int y){
		super(x, y, 49, 74);
		this.icoLeo = new ImageIcon(getClass().getResource("/images/debout-avant.png"));
		this.imgLeo = this.icoLeo.getImage();
		
		this.saut = false;
		this.cptsaut = 0;
		this.cptMort = 0;
	}

	
	//      GETTERS    //
	
	public Image getImgLeo() {return imgLeo;}


	public boolean isSaut() {return saut;}

	
	//      SETTERS       //
	
	
	public void setSaut(boolean saut) {this.saut = saut;}
	
	//      METHODES   // 
	public Image sauter(){
		
		ImageIcon ico;
		Image img;
		
		this.cptsaut++;   
		//monter du saut
		if(this.cptsaut <= 40){
			if(this.getY() > Main.scene.getHplafont()){
				this.setY(this.getY() -4);
		      }else{this.cptsaut = 41;}
			if(this.isVersdr() == true){
				ico = new ImageIcon(getClass().getResource("/images/saut-avant.png"));
			    img = ico.getImage();
			}else{
				ico = new ImageIcon(getClass().getResource("/images/saut-retour.png"));
			    img = ico.getImage();
			}
			
		//retomber du saut	
		}else if(this.getY() + this.getH() < Main.scene.getYsol()){
				this.setY(this.getY() + 1);
				if(this.isVersdr() == true){
					ico = new ImageIcon(getClass().getResource("/images/saut-avant.png"));
				    img = ico.getImage();
			}else{
				ico = new ImageIcon(getClass().getResource("/images/saut-retour.png"));
			    img = ico.getImage();
			}
				
		//saut terminer
				
		}else{ 
			if(this.isVersdr() == true){
				ico = new ImageIcon(getClass().getResource("/images/debout-avant.png"));
			    img = ico.getImage();
			}else{
				ico = new ImageIcon(getClass().getResource("/images/debout-retour.png"));
			    img = ico.getImage();
			}
		     this.saut = false;
		     this.cptsaut = 0;
	    }
		return img;
	}
	
public	void contact(Objets objet){
		//contact horizontal
		if((super.contactAvant(objet) == true && this.isVersdr() == true) || (super.contactRetour(objet) == true && this.isVersdr() == false)){
			Main.scene.setDx(0);
			this.setMarche(false);
		}
		
	  //contact avec un objet en dessous
		if(super.contactDessous(objet) == true && this.saut == true){ //saut sur un objet
			Main.scene.setYsol(objet.getY());
		}else if(super.contactDessous(objet) == false) { //tombe sur le sol initial
			Main.scene.setYsol(454); //altitude du sol initial
			if(this.saut == false){this.setY(375);} // altitude initial de lionel sur le jeu
		}
     //contact avec un objet au dessus
		if(super.contactDessus(objet) == true){
			Main.scene.setHplafont(objet.getY() + objet.getH());//le plafont devient le dessus de l'objet
		}else if(super.contactDessus(objet) == false && this.saut == false){
			Main.scene.setHplafont(0);
		}
		
	}

public boolean conctactPiece(Pieces piece){
	
	if(this.contactRetour(piece) == true || this.contactAvant(piece) == true || this.contactDessus(piece) == true){
		return true;
	}else{return false;}
 }
public void contact(personnage personne){
	if((super.contactRetour(personne) == true) /*|| (super.contactAvant(personne) == true)*/){
		this.setMarche(false);
		this.setVivant(false);
//	}else if(super.contactDessous(personne) == true){ 
//		personne.setMarche(false);
//		personne.setVivant(false);
	}
	
}	
	public Image meurt(){
		ImageIcon ico;
		Image img;
		ico = new ImageIcon(getClass().getResource("/images/boom.png"));
	    img = ico.getImage();
	    if(this.cptMort == 0){Audio.playSound("/Audio/explosion.wav");}
	    if(this.cptMort == 100){Audio.playSound("/Audio/partie-perdue.wav");}
		this.cptMort++;
		if(this.cptMort > 100){
			ico = new ImageIcon(getClass().getResource("/images/lionel-meurt.png"));
		    img = ico.getImage();
		    this.setY(this.getY() - 2);
		}
	    return img;
	}
}
 



