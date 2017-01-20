package Pacman;






import cs015.fnl.PacmanSupport.BoardLocation;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.EventHandler;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import javafx.event.ActionEvent;


public class Game {
	private Pane pacmanPane;
	private SmartSquare[][] _map;
	private Pacman _pacman;
	private Timeline _timeline;
	private Board _board;
	private Dot _dot;
	
	public Game(Pane pacmanPane){
		pacmanPane.isFocused();
		pacmanPane.setFocusTraversable(true);
		this.pacmanPane = pacmanPane;
		this._board = new Board();
		_dot = new Dot();
		
		// TODO set pacman's starting position here 
		 
		_pacman = new Pacman(_board.get_pacmanCurrPos());
		
		//set up timeline here
		this.setupTimeline();
		
		_map = new Board().get_map();
		
		for (int i = 0; i < _map.length; i++){
			for (int j = 0; j < _map[i].length; j++){
				
			pacmanPane.getChildren().addAll(_map[i][j].getNode(), _dot);
			
				
				
			}
		}
		pacmanPane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
		
	}
	
//	 set up of Timeline
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
			movePosition();
			
			event.consume();
		}
	
		
	}
	
	private class KeyHandler implements EventHandler<KeyEvent>{

		@Override
		public void handle(KeyEvent e) {
			switch(e.getCode()){
			case RIGHT:
				_pacman.setDirection("R");
			case LEFT:
				_pacman.setDirection("L");
			case UP:
				_pacman.setDirection("U");
			case DOWN:	
				_pacman.setDirection("D");
			}
			
		}
		
	}
	
	public void movePosition(){
		// update pacman's position
		// 0. check if pacman has a chosen direction
		String direction = _pacman.getDirection();
		if (direction == ""){
			return;
		}
		SmartSquare oldPos = _pacman.get_currentPos();
		// 1. check pacman's chosen direction
		// 2. check if pacman can move
		switch(direction){
			case "R":
				SmartSquare rPos = _board.getSquare((int) oldPos.getX()+1,(int) oldPos.getY());
				if (rPos.get_location() == BoardLocation.WALL){
					return;
				}
				else{
				
					updatePosition(oldPos, rPos);
				}
				break;
			case "L":
				SmartSquare lPos = _board.getSquare((int) oldPos.getX()-1,(int) oldPos.getY());
				if (lPos.get_location() == BoardLocation.WALL){
					return;
				}
				else{
				
					updatePosition(oldPos, lPos);
				}
				break;
			case "U":
				SmartSquare uPos = _board.getSquare((int) oldPos.getX(),(int) oldPos.getY()-1);
				if (uPos.get_location() == BoardLocation.WALL){
					return;
				}
				else{
				
					updatePosition(oldPos, uPos);
				}
				break;
			case "D":
				SmartSquare dPos = _board.getSquare((int) oldPos.getX(),(int) oldPos.getY()+1);
				if (dPos.get_location() == BoardLocation.WALL){
					return;
				}
				else{
				
					updatePosition(oldPos, dPos);
				}
				
		}
		// update the board space pacman is on
		
		
		// update pacman to reflect his new position 
		// update the board space of pacman's new position
		
	}
	
	public void updatePosition(SmartSquare oldPos, SmartSquare newPos){
		// redraw original square
		// set pacman's position
		// update new square to contain pacman
		// redraw new square;
		
		//update oldPos
		oldPos.setPacman(false);
		oldPos.setFill(Color.BLACK);
		//update newPos
		newPos.setPacman(true);
		newPos.setFill(Color.YELLOW);
		_pacman.set_currentPos(newPos);
	}
	
	public Pacman get_pacman(){
		return _pacman;
	}
	
	public void checkCollisions(){
		if (_pacman.get_currentPos().get_location() == BoardLocation.DOT){
			// for this purpose we want all dots to disappear both logically and graphically 
			_pacman.get_currentPos().setDot(false);
			//_pacman.get_currentPos().setFill(Color.BLACK);
			_pacman.get_currentPos().setFill(Color.YELLOW);
			// then we want to change the color of the space (graphically)
			// if pacman is an ellipse then redraw him/ if he is a square redraw square in yellow
			
		}
	}
	
	
}
