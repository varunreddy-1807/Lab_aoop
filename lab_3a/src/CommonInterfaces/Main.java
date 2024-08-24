package CommonInterfaces;

public class Main {
 public static void main(String[] args) {

	 LocalFileMusicPlayer localFilePlayer = new LocalFileMusicPlayer("song.mp3");
     OnlineStreamingServicePlayer onlinePlayer = new OnlineStreamingServicePlayer("http://streaming.example.com");
     RadioStationPlayer radioPlayer = new RadioStationPlayer("http://radio.example.com");

     MusicPlayer localFileAdapter = new LocalFileAdapter(localFilePlayer);
     MusicPlayer onlineAdapter = new OnlineStreamingAdapter(onlinePlayer);
     MusicPlayer radioAdapter = new RadioStationAdapter(radioPlayer);

     MusicPlayer equalizedLocalFilePlayer = new EqualizerDecorator(localFileAdapter);
     MusicPlayer volumeControlledOnlinePlayer = new VolumeControlDecorator(onlineAdapter);

     equalizedLocalFilePlayer.play();
     ((EqualizerDecorator) equalizedLocalFilePlayer).setEqualizer("Rock");
     
     volumeControlledOnlinePlayer.play();
     volumeControlledOnlinePlayer.setVolume(75);
 }
}

