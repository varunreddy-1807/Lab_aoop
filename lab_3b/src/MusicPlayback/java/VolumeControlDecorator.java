package MusicPlayback.java;

public class VolumeControlDecorator extends MusicPlaybackDecorator {
 public VolumeControlDecorator(MusicPlayback decoratedPlayback) {
     super(decoratedPlayback);
 }

 @Override
 public void setVolume(int volume) {
     super.setVolume(volume);
     System.out.println("Volume adjusted to: " + volume);
 }
}

