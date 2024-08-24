package MusicPlayback.java;

public class OnlineStreamingMusicSource implements MusicSource {
 private String streamUrl;

 public OnlineStreamingMusicSource(String streamUrl) {
     this.streamUrl = streamUrl;
 }

 @Override
 public void play() {
     System.out.println("Streaming music from " + streamUrl);
 }

 @Override
 public void pause() {
     System.out.println("Pausing online stream");
 }

 @Override
 public void stop() {
     System.out.println("Stopping online stream");
 }

 @Override
 public void setVolume(int volume) {
     System.out.println("Setting volume to " + volume + " for online stream");
 }
}

