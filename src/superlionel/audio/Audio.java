package superlionel.audio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Audio {
	private static Clip clip;
	
//Constructeur
	public Audio(String son){
		
		try {
			AudioInputStream audio = AudioSystem.getAudioInputStream(getClass().getResource(son));
			clip = AudioSystem.getClip();
			clip.open(audio);
		} catch (Exception e) {}
	}
	
	//Getter
	
	public Clip getClip() {return clip;}
	
	//Methode
	
	public void play(){clip.start();}
	
	public void stop(){clip.stop();}
	
	public static void playSound(String son){
		Audio s = new Audio(son);
		s.play();
	}
	public static void stopSound(){
		clip.stop();
	}
}
