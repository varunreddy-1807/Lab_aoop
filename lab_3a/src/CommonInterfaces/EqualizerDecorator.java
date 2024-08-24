package CommonInterfaces;

public class EqualizerDecorator extends MusicPlayerDecorator {
 public EqualizerDecorator(MusicPlayer decoratedPlayer) {
     super(decoratedPlayer);
 }

 public void setEqualizer(String settings) {
     System.out.println("Applying equalizer settings: " + settings);
 }
}

