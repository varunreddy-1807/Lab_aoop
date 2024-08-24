package MusicPlayback.java;

public abstract class MusicPlaybackDecorator implements MusicPlayback {
 protected MusicPlayback decoratedPlayback;

 public MusicPlaybackDecorator(MusicPlayback decoratedPlayback) {
     this.decoratedPlayback = decoratedPlayback;
 }

 @Override
 public void play() {
     decoratedPlayback.play();
 }

 @Override
 public void pause() {
     decoratedPlayback.pause();
 }

 @Override
 public void stop() {
     decoratedPlayback.stop();
 }

 @Override
 public void setVolume(int volume) {
     decoratedPlayback.setVolume(volume);
 }
}

