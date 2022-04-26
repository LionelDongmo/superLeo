package superLeo.jeu;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import superlionel.audio.Audio;
import Principal.Accueil;

@SuppressWarnings("serial")
public class Main extends JFrame implements ActionListener{
	JButton bmenu;
    public static Scene scene;
    Accueil A = new Accueil();
    public static void main(String[] args) {
	    Main m = new Main();
	    m.setVisible(true);
	    
    }
    public Main(){
//    	JFrame f = new JFrame("superLeo");
		this.setTitle("SuperLeo");	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900, 500);
	    this.setLocationRelativeTo(null);
	    this.setResizable(false);
		this.setAlwaysOnTop(true);
		
     	scene = new Scene();
     	bmenu = new JButton("Menu Principal");
     	
     	this.setContentPane(scene);
     	bmenu.setFont(Font.getFont("Ariel"));
  
     	this.add(bmenu);
     	
     	bmenu.addActionListener(this);

    	
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bmenu){
			this.setVisible(false);	
			A.setVisible(true);
			Audio.playSound("/Audio/intro.wav");
		}
		
	}
    
	
}
