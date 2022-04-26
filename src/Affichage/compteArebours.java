package Affichage;

public class compteArebours implements Runnable{
  private final int PAUSE = 1000;
  private int cptTemps;
  private String str;
  
  //Constructeur
  public compteArebours(){
	  
	  this.cptTemps = 170;
	  this.str = "Temps restant : 170";
	  Thread th = new Thread(this);
	  th.start();
  }
  //Getters
  
	public int getCptTemps() {return cptTemps;}

	public String getStr() {return str;}

  //Setters
  
  //Methode	
	@Override
	public void run() {
		while(true){
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {}
			this.cptTemps--;
			this.str = "Temps restant : " + this.cptTemps;
		}
		
	}

}
