
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class Code4Life {
	public static void main(String[] args) {

		// 1. Ask the user how many hours they spent coding this week.
		String Hours = JOptionPane.showInputDialog("How many hours did you spend coding this week?");
		// 2. If it is less than or equal to 2, tell them to stop watching YouTube and
		// write code instead.
		int hours = Integer.parseInt(Hours);
		if (hours == 2 || hours < 2) {
			JOptionPane.showMessageDialog(null, "Stop watching YouTube and write code instead.");
		}
		// 3. If it is greater than or equal to 3 AND less than or equal to 5, tell them
		// they're a Code Ninja
		if (hours == 3 || hours > 3 && hours < 5 || hours == 5) {
			JOptionPane.showMessageDialog(null, "You are a code ninja!");
		}
		// 4. If it is more than 5, call the method below to play the Batman theme song.
		if (hours > 5) {
			playBatmanTheme();
		}
	}

	private static void playBatmanTheme() {
		try {
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(Code4Life.class.getResource("batman.wav")));
			clip.start();
			Thread.sleep(60002);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}