package superlionel.objet;

import java.awt.Image;

import javax.swing.ImageIcon;

import superLeo.jeu.Main;

public class Objets {
	
	private int l, h, x, y;
	
	protected Image imgObjet;
	protected ImageIcon icoObjet;
	
	
	public Objets(int x, int y, int l, int h){
		this.x = x;
		this.y = y;
		this.l = l;
		this.h = h;
	}

//*******getters**********//
	public int getL() {return l;}

	public int getH() {return h;}
	
	public int getX() {return x;}
	
	public int getY() {return y;}
	
public Image getImgObjet() {return imgObjet;}

	//********setters*******//	
	public void setL(int l) {this.l = l;}

	public void setH(int h) {this.h = h;}
	
	public void setX(int x) {this.x = x;}

	public void setY(int y) {this.y = y;}

	//methode
	
	public void deplacement(){
		if(Main.scene.getxPos() >= 0){
			this.x = this.x - Main.scene.getDx();
		}
	}
}
