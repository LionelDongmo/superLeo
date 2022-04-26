package superLeo.personnage;

import java.awt.*;

import javax.swing.*;

import superLeo.jeu.Main;
import superlionel.objet.Objets;

public class personnage {
  private int L, H; //dimension du personnage
  private int x, y; // position du personnage
  private boolean marche; // vrai quant le persge marche
  private boolean versdr; //vrai quant le persge est tourne vers la droite
  public int compteur; // compteur de pas du personnage
  protected boolean vivant; // vrai si le personnage est vivant
	
  //*********CONSTRUCTEUR*******//
  
  public personnage(int x, int y, int L, int H){
	  this.x = x;
	  this.y = y;
	  this.L = L;
	  this.H = H;
	  this.compteur = 0;
	  this.marche = false;
	  this.versdr = true;
	  this.vivant = true;
  }


//********GETTERS*******//
public int getL() {return L;}

public int getH() {return H;}

public int getX() {return x;}

public boolean isMarche() {return marche;}

public boolean isVersdr() {return versdr;}

public int getCompteur() {	return compteur;}

public int getY() {return y;}

public boolean isVivant() {return vivant;}
  
//*******SETTERS******//  

public void setY(int y) {this.y = y;}

public void setL(int l) {L = l;}

public void setH(int h) {H = h;}

public void setX(int x) {this.x = x;}

public void setMarche(boolean marche) {this.marche = marche;}

public void setVersdr(boolean versdr) {	this.versdr = versdr;}

public void setCompteur(int compteur) {this.compteur = compteur;}

public void setVivant(boolean vivant) {this.vivant = vivant;}


//***** METHODE*****//
 
public Image marche(Image nom, int frq){ // pour lionel
	
	ImageIcon str ;
	
	if(this.marche == false || Main.scene.getxPos() <=0 || Main.scene.getxPos() > 5800 ){
		if(this.versdr == true){
			str = new ImageIcon(getClass().getResource("/images/debout-avant.png"));
			nom = str.getImage();
		}
		else{
			str = new ImageIcon(getClass().getResource("/images/debout-retour.png"));
			nom = str.getImage();
		
		}
	}
		else{
			this.compteur++;
			if(this.compteur / frq == 0){
				if(this.versdr == true){
					str = new ImageIcon(getClass().getResource("/images/debout-avant.png"));
				    nom = str.getImage();}
				else{
					str = new ImageIcon(getClass().getResource("/images/debout-retour.png"));
				    nom = str.getImage();
					}
				
				} else{
					 
					if(this.versdr == true){
						str = new ImageIcon(getClass().getResource("/images/courir-avant.png"));
					    nom = str.getImage();
					}
					else{
						str = new ImageIcon(getClass().getResource("/images/courir-retour.png"));
					    nom = str.getImage();
					}
					}
			}
			
			if(this.compteur == 2*frq){this.compteur = 0;}
    return nom;
     
     }
//***************************************************************pour la bombe
public Image marcheB(Image nom, int frq){ 
	
	ImageIcon str ;
	
	if(this.marche == false  ){
		if(this.versdr == true){
			str = new ImageIcon(getClass().getResource("/images/bombe-debout-avant-A.png"));
			nom = str.getImage();
		}
		else{
			str = new ImageIcon(getClass().getResource("/images/bombe-debout-retour-A.png"));
			nom = str.getImage();
		
		}
	}
		else{
			this.compteur++;
			if(this.compteur / frq == 0){
				if(this.versdr == true){
					str = new ImageIcon(getClass().getResource("/images/bombe-debout-avant-A.png"));
				    nom = str.getImage();}
				else{
					str = new ImageIcon(getClass().getResource("/images/bombe-debout-retour-A.png"));
				    nom = str.getImage();
					}
				
				} else{
					 
					if(this.versdr == true){
						str = new ImageIcon(getClass().getResource("/images/bombe-avant-A.png"));
					    nom = str.getImage();
					}
					else{
						str = new ImageIcon(getClass().getResource("/images/bombe-retour-A.png"));
					    nom = str.getImage();
					}
					}
			}
			
			if(this.compteur == 2*frq){this.compteur = 0;}
    return nom;
     
     }
//***********************************************fiN


public void deplacement(){
	if(Main.scene.getxPos() >= 0){
		this.x = this.x - Main.scene.getDx();
	}
}

//detection contact a droite

protected boolean contactAvant(Objets objet){
    	if(this.x + this.L < objet.getX() || this.x + this.L > objet.getX() + 5 || this.y + this.H <= objet.getY() || this.y >= objet.getY()+objet.getH()){
		return false;}
    	else{return true;}
}
//detection contact a gauche

protected boolean contactRetour(Objets objet){ 
    	if(this.x > objet.getX() + objet.getH()  || this.x + this.L < objet.getX() + objet.getL() - 5 || this.y + this.H <= objet.getY() || this.y >= objet.getY() + objet.getH()){
		return false;}
    	else{return true;}   	
}

//detection contact en dessous

protected boolean contactDessous(Objets objet){ 
  	if(this.x + this.L < objet.getX() + 5  || this.x  > objet.getX() + objet.getL() - 5 || this.y + this.H < objet.getH() || this.y + this.H > objet.getY() + 5){
		return false;}
  	else{return true;}   	
}

//detection contact au dessus

protected boolean contactDessus(Objets objet){ 
	if(this.x + this.L < objet.getX() + 5  || this.x  > objet.getX() + objet.getL() - 5 || this.y  < objet.getY() + objet.getH() || this.y > objet.getY() + objet.getH() + 5){
		return false;}
	else{return true;}   	
}

public boolean proche(Objets objet){ // pour eviter les conflits entre les objets quand lionel est proche 
	if((this.x > objet.getX() - 10 && this.x < objet.getX() + objet.getL() + 10) || (this.x + this.L > objet.getX() - 10 && this.x + this.L < objet.getX() + objet.getL() + 10)){
		return true;}
	else{return false;}
	}

protected boolean contactAvant(personnage personne){
  if(this.isVersdr() == true){
	if(this.x + this.L < personne.getX() || this.x + this.L > personne.getX() + 5 || this.y + this.H <= personne.getY() || this.y >= personne.getY() + personne.getH()){
		return false;}
    	else{return true;}
  }else{return false;}
	
}

protected boolean contactRetour(personnage personne){ 
	if(this.x > personne.getX() + personne.getL()  || this.x + this.L < personne.getX() + personne.getL() - 5 || this.y + this.H <= personne.getY() || this.y >= personne.getY() + personne.getH()){
	return false;}
	else{return true;}   	
}

protected boolean contactDessous(personnage personne){ 
  	if(this.x + this.L < personne.getX() || this.x  > personne.getX() + personne.getL() || this.y + this.H < personne.getY() || this.y + this.H > personne.getY()){
		return false;}
  	else{return true;}   	
}

public boolean proche(personnage personne){ // pour eviter les conflits entre les objets quand lionel est proche 
	if((this.x > personne.getX() - 10 && this.x < personne.getX() + personne.getL() + 10) || (this.x + this.L > personne.getX() - 10 && this.x + this.L < personne.getX() + personne.getL() + 10)){
		return true;}
	else{return false;}
	}

}