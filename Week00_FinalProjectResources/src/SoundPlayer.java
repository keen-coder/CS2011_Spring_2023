import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;


/**
 * This is a simple sound player for the video game project in CS2011.
 * 
 * Code was adapted from an example by Nam Ha Minh from www.codejava.net
 * 
 * DO NOT CHANGE THE CODE IN THIS FILE. The player may stop working.
 */

public class SoundPlayer {

	private static final int BUFFER_SIZE = 4096;
	
	private static final String SOUND_FOLDER = "sounds/";
	private static final String SOUND_EXT = ".wav";
	
	public static void play(String soundName) {
		soundName = SOUND_FOLDER + soundName + SOUND_EXT;
		
		File audioFile = new File(soundName);
		try {
			AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
			AudioFormat format = audioStream.getFormat();
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
			SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);
			audioLine.open(format);
			audioLine.start();
			byte[] bytesBuffer = new byte[BUFFER_SIZE];
			int bytesRead = -1;

			while ((bytesRead = audioStream.read(bytesBuffer)) != -1) {
				audioLine.write(bytesBuffer, 0, bytesRead);
			}
			audioLine.drain();
			audioLine.close();
			audioStream.close();
		} catch (UnsupportedAudioFileException ex) {
			System.out.println("The specified audio file is not supported.");
			ex.printStackTrace();
		} catch (LineUnavailableException ex) {
			System.out.println("Audio line for playing back is unavailable.");
			ex.printStackTrace();
		} catch (IOException ex) {
			System.out.println("Error playing the audio file.");
			ex.printStackTrace();
		}      
	}

}