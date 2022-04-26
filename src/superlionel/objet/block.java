package superlionel.objet;
import javax.swing.ImageIcon;

public class block extends Objets{
	
	//******************CONSTRUCTEUR*********************//	
	public block(int x, int y){
		super(x, y, 81, 80);
		super.icoObjet = new ImageIcon(getClass().getResource("/images/block.png"));
		super.imgObjet = this.icoObjet.getImage();
	}	
}
