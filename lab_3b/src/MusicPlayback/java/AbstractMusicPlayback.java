package MusicPlayback.java;

public abstract class AbstractMusicPlayback implements MusicPlayback {
 protected MusicSource musicSource;

 public AbstractMusicPlayback(MusicSource musicSource) {
     this.musicSource = musicSource;
 }

 @Override
 public void play() {
     musicSource.play();
 }

 @Override
 public void pause() {
     musicSource.pause();
 }

 @Override
 public void stop() {
     musicSource.stop();
 }

 @Override
 public void setVolume(int volume) {
     musicSource.setVolume(volume);
 }
}

