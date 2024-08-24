package CommonInterfaces;

 class LocalFileAdapter implements MusicPlayer {
 private LocalFileMusicPlayer localFileMusicPlayer;

 public LocalFileAdapter(LocalFileMusicPlayer localFileMusicPlayer) {
     this.localFileMusicPlayer = localFileMusicPlayer;
 }

 @Override
 public void play() {
     localFileMusicPlayer.play();
 }

 @Override
 public void pause() {
     localFileMusicPlayer.pause();
 }

 @Override
 public void stop() {
     localFileMusicPlayer.stop();
 }

 @Override
 public void setVolume(int volume) {
     localFileMusicPlayer.setVolume(volume);
 }
}

