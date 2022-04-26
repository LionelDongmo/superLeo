package Principal;
import java.awt.*;

import javax.swing.*;
@SuppressWarnings("serial")
public class Fond extends JPanel{
	private ImageIcon icoFond;
	private Image imgFond;
	private ImageIcon icotitre;
	private Image imgtitre;
	public Fond(){
		icoFond = new ImageIcon(getClass().getResource("/images/vue.png"));
        this.imgFond = this.icoFond.getImage();
        icotitre = new ImageIcon(getClass().getResource("/images/titre.png"));
        this.imgtitre = this.icotitre.getImage();
	}
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		Graphics g2 = (Graphics2D)g;
		g2.drawImage(imgFond, 0, 0, null);
		g2.drawImage(imgtitre, 300, 50, null);
	}	
}
