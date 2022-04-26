package superlionel.objet;
import javax.swing.*;
public class tuyaub extends Objets {
	
	//******************CONSTRUCTEUR*********************//
	public tuyaub(int x, int y){
		super(x, y, 43, 65);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/tuyaub.png"));
		super.imgObjet = this.icoObjet.getImage();
	}
	
}
