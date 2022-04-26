package Affichage;

public class Score {
     //Variable
	private final int nbre_tatal_pieces = 30;
	private int nbrepieces;
	
	// Constructeur
	
	public Score(){
		this.nbrepieces = 0;
	}

     // Getters
	public int getNbrepieces() {return nbrepieces;}
	
	public int getNbre_tatal_pieces() {return nbre_tatal_pieces;}

	// Setters	
	
	public void setNbrepieces(int nbrepieces) {this.nbrepieces = nbrepieces;}
}
