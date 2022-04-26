package Principal;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import superLeo.jeu.Main;
import superlionel.audio.Audio;

@SuppressWarnings("serial")
public class Accueil extends JFrame implements ActionListener{
	JButton bjouer, bquit, bopt;
	public static Fond f;
	
 public static void main(String[]agrs){
	 Accueil A = new Accueil();
	 A.setVisible(true);
	 Audio.playSound("/Audio/intro.wav");
 }
 
 public Accueil(){
	 this.setTitle("SuperLeo");	
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setSize(900, 500);
	 this.setLocationRelativeTo(null);
	 this.setResizable(false);
	 this.setAlwaysOnTop(true);
	 bjouer = new JButton("JOUER");
	 bopt = new JButton("OPTION");
	 bquit = new JButton("Quiter");
	 f = new Fond();
	 this.setLayout(null);
	 this.setContentPane(f);
	 this.add(bjouer);
	 this.add(bopt);
	 this.add(bquit);
	 bjouer.setBackground(Color.green);
	 bquit.setBackground(Color.RED);
	 bjouer.addActionListener(this);
	 bopt.addActionListener(this);
	 bquit.addActionListener(this);
 }
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bquit)
			System.exit(0);
		if(e.getSource() == bjouer){
			Main M= new Main();
			this.setVisible(false);	
			M.setVisible(true);
			Audio.stopSound();
		}
	} 
}
