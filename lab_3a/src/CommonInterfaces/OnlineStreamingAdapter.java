package CommonInterfaces;

public class OnlineStreamingAdapter implements MusicPlayer {
 private OnlineStreamingServicePlayer onlineStreamingServicePlayer;

 public OnlineStreamingAdapter(OnlineStreamingServicePlayer onlineStreamingServicePlayer) {
     this.onlineStreamingServicePlayer = onlineStreamingServicePlayer;
 }

 @Override
 public void play() {
     onlineStreamingServicePlayer.play();
 }

 @Override
 public void pause() {
     onlineStreamingServicePlayer.pause();
 }

 @Override
 public void stop() {
     onlineStreamingServicePlayer.stop();
 }

 @Override
 public void setVolume(int volume) {
     onlineStreamingServicePlayer.setVolume(volume);
 }
}
