package Pacman;



import java.time.Duration;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;


public class Game {
	private Pane pacmanPane;
	private SmartSquare[][] _map;
	private Pacman _pacman;
	private Timeline _timeline;
	
	public Game(Pane pacmanPane){
		pacmanPane.isFocused();
		pacmanPane.setFocusTraversable(true);
		this.pacmanPane = pacmanPane;
		
		_pacman = new Pacman();
		
		//set up timeline here
		
		_map = new Board().get_map();
		
		for (int i = 0; i < _map.length; i++){
			for (int j = 0; j < _map[i].length; j++){
				
			pacmanPane.getChildren().addAll(_map[i][j].getNode());
			
				
				
			}
		}
	//	pacmanPane.getChildren().add(_pacman.getNode());
		
	}
	
	// set up of Timeline
	public void setupTimeline() {
		KeyFrame kf = new KeyFrame(Duration.millis(500), new TimeHandler());
		_timeline = new Timeline(kf);
		_timeline.setCycleCount(Animation.INDEFINITE);
		_timeline.play();
	}

	private class TimeHandler implements EventHandler<ActionEvent> {

		public TimeHandler() {
		}
// what get called during the handle method of the TimeHandler
		public void handle(ActionEvent event){
			// add methods
		}
	

	}
	
}
