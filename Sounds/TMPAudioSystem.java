package Sounds;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.URL;


public class TMPAudioSystem{


   public TMPAudioSystem(){


        URL soundUrl = TMPAudioSystem.class.getResource("res/hero_decorative-celebration-02.wav");

        AudioInputStream soundStream;
        try {
            assert soundUrl != null;
            soundStream = AudioSystem.getAudioInputStream(soundUrl);
        } catch (UnsupportedAudioFileException | IOException ex) {
            throw new RuntimeException(ex);
        }
        Clip clip = null;
        try {
            clip = AudioSystem.getClip();
        } catch (LineUnavailableException ex) {
            throw new RuntimeException(ex);
        }
        try {
            clip.open(soundStream);
        } catch (LineUnavailableException | IOException ex) {
            throw new RuntimeException(ex);
        }
        clip.start();
        try {
            Thread.sleep(clip.getMicrosecondLength()/ 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
