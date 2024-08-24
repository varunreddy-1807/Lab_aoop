package MusicPlayback.java;

public class Main {
 public static void main(String[] args) {
     MusicSource localFileSource = new LocalFileMusicSource("song.mp3");
     MusicSource onlineSource = new OnlineStreamingMusicSource("http://streaming.example.com");
     MusicSource radioSource = new RadioStationMusicSource("http://radio.example.com");

     MusicPlayback localFilePlayback = new BasicMusicPlayback(localFileSource);
     MusicPlayback onlinePlayback = new BasicMusicPlayback(onlineSource);
     MusicPlayback radioPlayback = new BasicMusicPlayback(radioSource);

     MusicPlayback equalizedLocalFilePlayback = new EqualizerDecorator(localFilePlayback);
     MusicPlayback volumeControlledOnlinePlayback = new VolumeControlDecorator(onlinePlayback);

     equalizedLocalFilePlayback.play();
     ((EqualizerDecorator) equalizedLocalFilePlayback).setEqualizer("Rock");

     volumeControlledOnlinePlayback.play();
     volumeControlledOnlinePlayback.setVolume(75);
 }
}

