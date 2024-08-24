package MusicPlayback.java;

public class EqualizerDecorator extends MusicPlaybackDecorator {
 public EqualizerDecorator(MusicPlayback decoratedPlayback) {
     super(decoratedPlayback);
 }

 public void setEqualizer(String settings) {
     System.out.println("Applying equalizer settings: " + settings);
 }
}
