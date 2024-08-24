package CommonInterfaces;

public class OnlineStreamingServicePlayer {
 private String streamUrl;

 public OnlineStreamingServicePlayer(String streamUrl) {
     this.streamUrl = streamUrl;
 }

 public void play() {
     System.out.println("Streaming music from " + streamUrl);
 }

 public void pause() {
     System.out.println("Pausing online stream");
 }

 public void stop() {
     System.out.println("Stopping online stream");
 }

 public void setVolume(int volume) {
     System.out.println("Setting volume to " + volume + " for online stream");
 }
}

