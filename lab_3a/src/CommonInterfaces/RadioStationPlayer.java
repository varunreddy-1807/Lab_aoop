package CommonInterfaces;

public class RadioStationPlayer {
 private String stationUrl;

 public RadioStationPlayer(String stationUrl) {
     this.stationUrl = stationUrl;
 }

 public void play() {
     System.out.println("Tuning into radio station " + stationUrl);
 }

 public void pause() {
     System.out.println("Pausing radio station");
 }

 public void stop() {
     System.out.println("Stopping radio station");
 }

 public void setVolume(int volume) {
     System.out.println("Setting volume to " + volume + " for radio station");
 }
}

