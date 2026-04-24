package application;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class BackgroundMusic {
	Media music;
	MediaPlayer player;
	public boolean isMusic = false;
	
	BackgroundMusic(){
		this.music = new Media(getClass().getResource("/TekknonladeBGMusic.mp3").toExternalForm());
		this.player = new MediaPlayer(music);
	}
	public void playMusic() {
		if(isMusic == false) {
			this.player.setCycleCount(MediaPlayer.INDEFINITE);
			this.player.play();
		}
		
	}
	
	public void stopMusic() {
		this.player.stop();
	}
}
