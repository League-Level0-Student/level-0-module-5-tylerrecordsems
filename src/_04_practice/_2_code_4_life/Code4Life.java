package _04_practice._2_code_4_life;

import java.applet.AudioClip;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Code4Life {
public static void main(String[] args) {
	

	// 1. Ask the user how many hours they spent coding this week.
String h = JOptionPane.showInputDialog("How many hours have you spent coding this week.");
	// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
	// write code instead.

int hi = Integer.parseInt(h);
if(hi <= 2 ){
	JOptionPane.showMessageDialog(null, "stop watching YouTube and write code instead.");


	// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
	// they're a Code Ninja
}if(hi >= 3 || hi<= 5 ){
	JOptionPane.showMessageDialog(null, "");

	// 4. If it is more than 5, call the method below to play the Batman theme song.
	// NOTE: You may have to get batman.wav from league-sounds on github: https://github.com/jointheleague/league-sounds
}(hi >= 5 ){
	playBatmanTheme();
}
private static void  playBatmanTheme(); {
		try {
			AudioClip sound = JApplet.newAudioClip(Code4Life.class.getResource("batman.wav"));
			sound.play();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}

private static void playBatmanTheme() {
	// TODO Auto-generated method stub
	
}
}
