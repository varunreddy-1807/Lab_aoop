package CommonInterfaces;

public class RadioStationAdapter implements MusicPlayer {
 private RadioStationPlayer radioStationPlayer;

 public RadioStationAdapter(RadioStationPlayer radioStationPlayer) {
     this.radioStationPlayer = radioStationPlayer;
 }

 @Override
 public void play() {
     radioStationPlayer.play();
 }

 @Override
 public void pause() {
     radioStationPlayer.pause();
 }

 @Override
 public void stop() {
     radioStationPlayer.stop();
 }

 @Override
 public void setVolume(int volume) {
     radioStationPlayer.setVolume(volume);
 }
}

