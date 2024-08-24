package CommonInterfaces;

public class VolumeControlDecorator extends MusicPlayerDecorator {
 public VolumeControlDecorator(MusicPlayer decoratedPlayer) {
     super(decoratedPlayer);
 }

 @Override
 public void setVolume(int volume) {
     super.setVolume(volume);
     System.out.println("Volume adjusted to: " + volume);
 }
}
