package superLeo.jeu;
import javax.swing.*;

import Affichage.Score;
import Affichage.compteArebours;
import superLeo.personnage.Bombe;
import superLeo.personnage.Lionel;


import superlionel.audio.Audio;
import superlionel.objet.block;
import superlionel.objet.Objets;
import superlionel.objet.Pieces;
import superlionel.objet.tuyaub;

import java.awt.*;
import java.util.ArrayList;
@SuppressWarnings("serial")
public class Scene extends JPanel {
	
	//****** VARIABLE*******//

	private ImageIcon icoFond;
	private Image imgFond1;
	private Image imgFond2;
	
	private ImageIcon icomaison;
	private Image imgmaison;
	private int xFond1;
	private int xFond2;
	private int dx;
	private int xPos;
	private int ysol;
	private int hplafont;
	
	public Lionel lionel;
	public Bombe bombe;

	
	public tuyaub tuy1;
	public tuyaub tuy2;
	public tuyaub tuy3;
	public tuyaub tuy4;
	public tuyaub tuy5;
	public tuyaub tuy6;
	public tuyaub tuy7;
	public tuyaub tuy8;
	public tuyaub tuy9;

	public block blo1;
	public block blo2;
	public block blo3;
	public block blo4;
	public block blo5;
	public block blo6;
	public block blo7;
	public block blo8;
	public block blo9;
	public block blo10;
	public block blo11;
	public block blo12;
	public block blo13;
	
	public Pieces pieceR1;
	public Pieces pieceR2;
	public Pieces pieceR3;
	public Pieces pieceR4;
	public Pieces pieceR5;
	public Pieces pieceR6;
	public Pieces pieceR7;
	public Pieces pieceR8;
	public Pieces pieceR9;
	public Pieces pieceR10;
	public Pieces pieceR11;
	public Pieces pieceR12;
	public Pieces pieceR13;
	public Pieces pieceR14;
	public Pieces pieceR15;
	public Pieces pieceR16;
	public Pieces pieceR17;
	public Pieces pieceR18;
	public Pieces pieceR19;
	public Pieces pieceR20;
	public Pieces pieceR21;
	public Pieces pieceR22;
	public Pieces pieceR23;
	public Pieces pieceR24;
	public Pieces pieceR25;
	public Pieces pieceR26;
	public Pieces pieceR27;
	public Pieces pieceR28;
	public Pieces pieceR29;
	public Pieces pieceR30;
	
	public Bombe bombe1;
	public Bombe bombe2;
	public Bombe bombe3;
	public Bombe bombe4;
	public Bombe bombe5;
	public Bombe bombe6;
	public Bombe bombe7;
	public Bombe bombe8;
	public Bombe bombe9;	
	public Bombe bombe10;
	public Bombe bombe11;
	public Bombe bombe12;
	public Bombe bombe13;
	public Bombe bombe14;
	public Bombe bombe15;
	public Bombe bombe16;
	public Bombe bombe17;
	
	
	private ImageIcon icoarriver;
	private Image imgarriver;
	private ImageIcon icomaisonAr;
	private Image imgmaisonAr;

	private ArrayList<Objets>tabobjet; //tableau pour tous les objets du jeu
    private ArrayList<Pieces>tabpiece; //tableau pour toutes les piece du jeu
    private ArrayList<Bombe>tabbombe; //tableau pour toutes les bombe du jeu
                
    private Score score;
    private Font police;
    private compteArebours compte;
    private boolean ok;
    
	//********CONSTRUCTEUR****//
	public Scene(){	
		super();
		
		this.xFond1 = -50;
		this.xFond2 = 850;
		this.dx = 0;
	    this.xPos = -1;
		this.ysol = 454;
		this.hplafont = 0;
		this.ok = true;
	
		icoFond = new ImageIcon(getClass().getResource("/images/font1.jpg"));
        this.imgFond1 = this.icoFond.getImage();
        this.imgFond2 = this.icoFond.getImage();
		
		icomaison = new ImageIcon(getClass().getResource("/images/Maison-aller.png"));
        this.imgmaison = this.icomaison.getImage();
		
        lionel = new Lionel(400, 375);
        
        tuy1 = new tuyaub(500, 350);
        tuy2 = new tuyaub(1100, 350);
        tuy3 = new tuyaub(1850, 350);
        tuy4 = new tuyaub(2150, 350);
        tuy5 = new tuyaub(2750, 350);
        tuy6 = new tuyaub(3250, 350);
        tuy7 = new tuyaub(4050, 350);
        tuy8 = new tuyaub(4750, 350);
        tuy9 = new tuyaub(5400, 350);
        
        blo1 = new block(750, 250);
        blo2 = new block(1350, 260);
        blo3 = new block(1580, 200);
        blo4 = new block(2300, 250);
        blo5 = new block(2850, 230);
        blo6 = new block(3200, 250);
        blo7 = new block(3500, 230);
        blo8 = new block(3800, 210);
        blo9 = new block(4150, 240);
        blo10 = new block(4350, 200);
        blo11 = new block(4600, 180);
        blo12= new block(5000, 250);
        blo13= new block(5300, 200);
        
        pieceR1 = new Pieces(402, 145);
        pieceR2 = new Pieces(1202, 140);	
        pieceR3 = new Pieces(1272, 95);
        pieceR4 = new Pieces(1342, 40);	
        pieceR5 = new Pieces(1650, 145);	
        pieceR6 = new Pieces(2650, 145);	
        pieceR7 = new Pieces(3000, 135);	
        pieceR8 = new Pieces(3400, 225);	
        pieceR9 = new Pieces(4200, 145);	
        pieceR10 =new Pieces(4600, 40);	
        pieceR11 =new Pieces(5400, 30);
        pieceR12 =new Pieces(700, 430);
        pieceR13 =new Pieces(900, 430);
        pieceR14 =new Pieces(1300, 430);
        pieceR15 =new Pieces(1600, 430);
        pieceR16 =new Pieces(1750, 430);
        pieceR17 =new Pieces(1620, 145);
        pieceR18 =new Pieces(1600, 145);
        pieceR19 =new Pieces(1950, 430);
        pieceR20 =new Pieces(2000, 430);
        pieceR21 =new Pieces(2400, 430);
        pieceR22 =new Pieces(2650, 430);
        pieceR23 =new Pieces(3000, 430);
        pieceR24 =new Pieces(3850, 430);
        pieceR25 =new Pieces(4400, 430);
        pieceR26 =new Pieces(5300, 430);
        pieceR27 =new Pieces(3200, 125);
        pieceR28 =new Pieces(3800, 180);
        pieceR29 =new Pieces(4500, 40);
        pieceR30 =new Pieces(5000, 100);
        
        bombe1 = new Bombe(600, 390);
        bombe2 = new Bombe(1000, 390);
        bombe3 = new Bombe(1100, 390);
        bombe4 = new Bombe(1700, 390);
        bombe5 = new Bombe(2000, 390);
        bombe6 = new Bombe(2300, 390);
        bombe7 = new Bombe(2650, 390);
        bombe8 = new Bombe(2850, 390);
        bombe9 = new Bombe(3050, 390);
        bombe10 = new Bombe(3400, 390);
        bombe11 = new Bombe(3600, 390);
        bombe12 = new Bombe(3950, 390);
        bombe13 = new Bombe(4200, 390);
        bombe14 = new Bombe(4600, 390);
        bombe15 = new Bombe(4850, 390);
        bombe16 = new Bombe(5000, 390);
        bombe17 = new Bombe(5300, 390);
       
        
        
        this.icomaisonAr = new ImageIcon(getClass().getResource("/images/Maison-arriver.png"));
        this.imgmaisonAr = this.icomaisonAr.getImage();
        
        this.icoarriver= new ImageIcon(getClass().getResource("/images/arriver.PNG"));
        this.imgarriver = this.icoarriver.getImage();
        
        tabobjet = new ArrayList<Objets>();
        
        this.tabobjet.add(this.tuy1);
        this.tabobjet.add(this.tuy2);
        this.tabobjet.add(this.tuy3);
        this.tabobjet.add(this.tuy4);
        this.tabobjet.add(this.tuy5);
        this.tabobjet.add(this.tuy6);
        this.tabobjet.add(this.tuy7);
        this.tabobjet.add(this.tuy8);
        this.tabobjet.add(this.tuy9);
        
        this.tabobjet.add(this.blo1);
        this.tabobjet.add(this.blo2);
        this.tabobjet.add(this.blo3);
        this.tabobjet.add(this.blo4);
        this.tabobjet.add(this.blo5);
        this.tabobjet.add(this.blo6);
        this.tabobjet.add(this.blo7);
        this.tabobjet.add(this.blo8);
        this.tabobjet.add(this.blo9);
        this.tabobjet.add(this.blo10);
        this.tabobjet.add(this.blo11);
        this.tabobjet.add(this.blo12);
        this.tabobjet.add(this.blo13);
    
        
        tabpiece = new ArrayList<Pieces>();
        
        this.tabpiece.add(this.pieceR1);
        this.tabpiece.add(this.pieceR2);
        this.tabpiece.add(this.pieceR3);
        this.tabpiece.add(this.pieceR4);
        this.tabpiece.add(this.pieceR5);
        this.tabpiece.add(this.pieceR6);
        this.tabpiece.add(this.pieceR7);
        this.tabpiece.add(this.pieceR8);
        this.tabpiece.add(this.pieceR9);
        this.tabpiece.add(this.pieceR10);
        this.tabpiece.add(this.pieceR11);
        this.tabpiece.add(this.pieceR12);
        this.tabpiece.add(this.pieceR13);
        this.tabpiece.add(this.pieceR14);
        this.tabpiece.add(this.pieceR15);
        this.tabpiece.add(this.pieceR16);
        this.tabpiece.add(this.pieceR17);
        this.tabpiece.add(this.pieceR18);
        this.tabpiece.add(this.pieceR19);
        this.tabpiece.add(this.pieceR20);
        this.tabpiece.add(this.pieceR21);
        this.tabpiece.add(this.pieceR22);
        this.tabpiece.add(this.pieceR23);
        this.tabpiece.add(this.pieceR24);
        this.tabpiece.add(this.pieceR25);
        this.tabpiece.add(this.pieceR26);
        this.tabpiece.add(this.pieceR27);
        this.tabpiece.add(this.pieceR28);
        this.tabpiece.add(this.pieceR29);
        this.tabpiece.add(this.pieceR30);

        tabbombe = new ArrayList<Bombe>();
        		
        this.tabbombe.add(this.bombe1);
        this.tabbombe.add(this.bombe2);
        this.tabbombe.add(this.bombe3);
        this.tabbombe.add(this.bombe4);
        this.tabbombe.add(this.bombe5);
        this.tabbombe.add(this.bombe6);
        this.tabbombe.add(this.bombe7);
        this.tabbombe.add(this.bombe8);
        this.tabbombe.add(this.bombe9);
        this.tabbombe.add(this.bombe10);
        this.tabbombe.add(this.bombe11);
        this.tabbombe.add(this.bombe12);
        this.tabbombe.add(this.bombe13);
        this.tabbombe.add(this.bombe14);
        this.tabbombe.add(this.bombe15);
        this.tabbombe.add(this.bombe16);
        this.tabbombe.add(this.bombe17);
      
        
        
        
        this.setFocusable(true);
		this.requestFocusInWindow();
    	this.addKeyListener(new Clavier());
    	
    	score = new Score();
    	police = new Font("Arial", Font.PLAIN, 18);
    	
    	compte = new compteArebours();
    	
		Thread chronoE = new Thread(new Chrono());
		chronoE.start();
	}
      //*******getters******//
	public int getDx() {return dx;}
	
     public int getxPos() {return xPos;}

     public int getxFond1() {return xFond1;}
     
     public int getxFond2() {return xFond2;}
     
	public int getHplafont() {return hplafont;}
	
	public int getYsol() {return ysol;}
	
	public block getBlo1() {return blo1;}
	
	//*******setters******//
	
	public void setDx(int dx) {this.dx = dx;}
	
	public void setxPos(int xPos) {this.xPos = xPos;}
	
	public void setxFond1(int xFond1) {this.xFond1 = xFond1;}
	
	public void setxFond2(int xFond2) {this.xFond2 = xFond2;}
	
	public void setYsol(int ysol) {this.ysol = ysol;}
	
	public void setHplafont(int hplafont) {this.hplafont = hplafont;}
	
	
	// ******Methods******//	
	
	public void deplacementFond(){
		if(this.xPos >=0 && this.xPos <= 5800){
		  this.xPos = this.xPos + this.dx;
		  this.xFond1 = this.xFond1 - this.dx;
		  this.xFond2 = this.xFond2 - this.dx;
		
		}
		//permanence du Font d'ecran
		if(this.xFond1 == -900){this.xFond1 = 900;}	
		else if(this.xFond2 == -900){this.xFond2 = 900;}
		else if(this.xFond1 == 900){this.xFond1 = -900;}	
		else if(this.xFond2 == 900){this.xFond2 = -900;}
	}
	
	private boolean partieGagnee(){
		if(this.compte.getCptTemps() > 0 && this.lionel.isVivant() == true && this.score.getNbrepieces() >= 20 && this.xPos > 5600){
		   if(this.ok == true){
			   Audio.playSound("/Audio/partie-gagnee.wav");
			   this.ok = false;
		   }
			return true;
		}else{return false;} 
	}
	
	private boolean partiePerdue(){
		if(this.lionel.isVivant() == false || this.compte.getCptTemps() <= 0){
			return true;
		}else{return false;}
	}

	private boolean finDePartie(){
		if(this.partiePerdue() == true || this.partieGagnee() == true){
			return true;
		}else{return false;}
			
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g; 
	
	//detection contact avec les objets
		
		for (int i = 0; i < this.tabobjet.size(); i++) {
			//lionel
		   if(this.lionel.proche(this.tabobjet.get(i))){this.lionel.contact(this.tabobjet.get(i));}
			//bombe
		   for (int j = 0; j < this.tabbombe.size(); j++) {
		       if(this.tabbombe.get(j).proche(this.tabobjet.get(i))){this.tabbombe.get(j).contact(this.tabobjet.get(i));}		
		      }
		}	
   // detection des conctacts de Lionel  avec les pieces
	   for (int i = 0; i < this.tabpiece.size(); i++) {
			if(this.lionel.proche(this.tabpiece.get(i))){
				if(this.lionel.conctactPiece(this.tabpiece.get(i))){
					Audio.playSound("/Audio/piece.wav");
					this.tabpiece.remove(i);
					this.score.setNbrepieces(this.score.getNbrepieces() + 1);
					
				}
	        }		
		}
			
        //Detection des contact des Bombes avec les Personnages (hors Lionel)
			for(int i = 0; i<this.tabbombe.size(); i++){
				//Bombe
				for(int j = 0; j < tabbombe.size(); j++){
					if(j != i){
					if(this.tabbombe.get(j).proche(this.tabbombe.get(i))){this.tabbombe.get(j).contact(this.tabbombe.get(i));}		
				}
			}
		}
			
			
		//detection des contacts de Lionel avec des personnages
		// Bombes
		for(int i = 0; i < tabbombe.size(); i++){
			if(this.lionel.proche(this.tabbombe.get(i)) && this.tabbombe.get(i).isVivant() == true){
				this.lionel.contact(this.tabbombe.get(i));
			}	
		}

		//deplacement de tous les objet fixes du jeu
		
		this.deplacementFond();
		if(this.xPos >=0 && this.xPos <= 5800){
	     for (int i = 0; i < this.tabobjet.size(); i++) {this.tabobjet.get(i).deplacement(); }
		 for (int i = 0; i < this.tabpiece.size(); i++) {this.tabpiece.get(i).deplacement();}
		 for (int i = 0; i < this.tabbombe.size(); i++) {this.tabbombe.get(i).deplacement(); }
                   		 
		}
		//image de fond
		g2.drawImage(this.imgFond1, this.xFond1, 0, null);
		g2.drawImage(this.imgFond2, this.xFond2, 0, null);
	
		//image de la maison de dapart
		g2.drawImage(imgmaison, 5 - this.xPos, 230, null);
		 //image des pieces
		for (int i = 0; i < this.tabpiece.size(); i++) {
			g2.drawImage(this.tabpiece.get(i).bouge(), this.tabpiece.get(i).getX(), this.tabpiece.get(i).getY(), null);
		}
		//imges des objets
		for (int i = 0; i < this.tabobjet.size(); i++) {
			g2.drawImage(this.tabobjet.get(i).getImgObjet(), this.tabobjet.get(i).getX(), this.tabobjet.get(i).getY(), null);
		}
		//image de la maison d'arrivee
			g2.drawImage(imgmaisonAr, 6200 - this.xPos, 230, null);
		//image arrivee
			g2.drawImage(imgarriver, 6100 - this.xPos, 375, null);
		//image de lionel
		if(this.lionel.isVivant() == true){
			if(this.lionel.isSaut()){g2.drawImage(this.lionel.sauter(), this.lionel.getX(), this.lionel.getY(), null);}
			else{g2.drawImage(this.lionel.marche(this.lionel.getImgLeo(), 5), this.lionel.getX(), this.lionel.getY(), null);}
		}else{g2.drawImage(this.lionel.meurt(), this.lionel.getX(), this.lionel.getY(), null);}
		
		//image bombe
		for(int i = 0; i<this.tabbombe.size(); i++){
			if(this.tabbombe.get(i).isVivant() == true){
			     g2.drawImage(this.tabbombe.get(i).marcheB(this.tabbombe.get(i).getImgBombe(), 25), this.tabbombe.get(i).getX(), this.tabbombe.get(i).getY(), null);
			}else{
				g2.drawImage(this.tabbombe.get(i).meurt(), this.tabbombe.get(i).getX(), this.tabbombe.get(i).getY() + 10, null);
			}	
		}
		
	    	
		
		// Mise jour du SCORE
		g2.setFont(police);
		g2.drawString(this.score.getNbrepieces() + " piece(s) trouvee(s) sur " + this.score.getNbre_tatal_pieces(), 625, 50);
 	    // Mise jour du Temps restant
		g2.drawString(this.compte.getStr(), 5, 25);
		Font police1= new Font("Ariel", Font.ITALIC, 14);
		g2.setFont(police1);
		g2.drawString("Il faut au moins 20pieces pour gagner la partie ", 580, 25);
		//Fin de Partie
		if(this.finDePartie() == true){
			Font policeFin = new Font("Ariel", Font.BOLD, 50);
			g2.setFont(policeFin);
			if(this.partieGagnee() == true){
				g2.drawString("Vous avez Gagné!!!!", 250, 250);
			}else{g2.drawString("Vous avez Perdu", 250, 250);}
		}
	}
	
}
