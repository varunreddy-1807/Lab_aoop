package MusicPlayback.java;

public class LocalFileMusicSource implements MusicSource {
 private String filePath;

 public LocalFileMusicSource(String filePath) {
     this.filePath = filePath;
 }

 @Override
 public void play() {
     System.out.println("Playing music from " + filePath);
 }

 @Override
 public void pause() {
     System.out.println("Pausing local file music");
 }

 @Override
 public void stop() {
     System.out.println("Stopping local file music");
 }

 @Override
 public void setVolume(int volume) {
     System.out.println("Setting volume to " + volume + " for local file music");
 }
}

