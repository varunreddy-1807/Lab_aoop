package CommonInterfaces;

public class LocalFileMusicPlayer {
 private String filePath;

 public LocalFileMusicPlayer(String filePath) {
     this.filePath = filePath;
 }

 public void play() {
     System.out.println("Playing music from " + filePath);
 }

 public void pause() {
     System.out.println("Pausing local file music");
 }

 public void stop() {
     System.out.println("Stopping local file music");
 }

 public void setVolume(int volume) {
     System.out.println("Setting volume to " + volume + " for local file music");
 }
}
