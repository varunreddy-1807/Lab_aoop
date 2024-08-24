package MusicPlayback.java;

public class RadioStationMusicSource implements MusicSource {
 private String stationUrl;

 public RadioStationMusicSource(String stationUrl) {
     this.stationUrl = stationUrl;
 }

 @Override
 public void play() {
     System.out.println("Tuning into radio station " + stationUrl);
 }

 @Override
 public void pause() {
     System.out.println("Pausing radio station");
 }

 @Override
 public void stop() {
     System.out.println("Stopping radio station");
 }

 @Override
 public void setVolume(int volume) {
     System.out.println("Setting volume to " + volume + " for radio station");
 }
}

