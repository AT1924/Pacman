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
	private Pacman _pacman;
	private Timeline _timeline;
	private Board _board;
	
	
	public Game(Pane pacmanPane){
		pacmanPane.isFocused();
		pacmanPane.setFocusTraversable(true);
		this.pacmanPane = pacmanPane;
		
		
		
		// TODO set pacman's starting position here 
		 
		_pacman = new Pacman(null);
	//	_pacman = new Pacman(_board.get_pacmanCurrPos());
		this._board = new Board(_pacman);
		
		//set up timeline here
		this.setupTimeline();
		
		 SmartSquare[][] _map = _board.get_map();
		
		for (int i = 0; i < _map.length; i++){
			for (int j = 0; j < _map[i].length; j++){
				
			pacmanPane.getChildren().addAll(_map[i][j].getNode());
				
				
			}
		}
		pacmanPane.addEventHandler(KeyEvent.KEY_PRESSED, new KeyHandler());
		
	}
	
//	 set up of Timeline
	public void setupTimeline() {
		KeyFrame kf = new KeyFrame(Duration.millis(2000), new TimeHandler());
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
				break;
			case LEFT:
				_pacman.setDirection("L");
				break;
			case UP:
				_pacman.setDirection("U");
				break;
			case DOWN:	
				_pacman.setDirection("D");
				break;
			 default:
				 break;
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
				SmartSquare rPos = _board.getSquare((int) oldPos.get_yPos(), (int) oldPos.get_xPos()+1);
				if (rPos.get_isWall()){
					// thinks rPos is a wall, bug
					return;
				}
				else{
				
					updatePosition(oldPos, rPos);
				}
				break;
			case "L":
				SmartSquare lPos = _board.getSquare((int) oldPos.get_xPos()-1,(int) oldPos.get_yPos());
				if (lPos.get_isWall()){
					return;
				}
				else{
				
					updatePosition(oldPos, lPos);
				}
				break;
			case "U":
				SmartSquare uPos = _board.getSquare((int) oldPos.get_xPos(),(int) oldPos.get_yPos()-1);
				if (uPos.get_isWall()){
					return;
				}
				else{
				
					updatePosition(oldPos, uPos);
				}
				break;
			case "D":
				SmartSquare dPos = _board.getSquare((int) oldPos.get_xPos(),(int) oldPos.get_yPos()+1);
				if (dPos.get_isWall()){
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
		_pacman.set_currentPos(newPos);
		newPos.setFill(Color.YELLOW);
		@SuppressWarnings("unused")
		int x = 0;
	}
	
	public Pacman get_pacman(){
		return _pacman;
	}
	
	public void checkCollisions(){
		if (_pacman.get_currentPos().get_location() == BoardLocation.DOT){
			// for this purpose we want all dots to disappear both logically and graphically 
			_pacman.get_currentPos().setDot(false);
			// need a reference to the dot on the smartsquare
			//pacmanPane.getChildren().remove()
			//_pacman.get_currentPos().setFill(Color.BLACK);
			_pacman.get_currentPos().setFill(Color.YELLOW);
			// then we want to change the color of the space (graphically)
			// if pacman is an ellipse then redraw him/ if he is a square redraw square in yellow
			
		}
	}
	
	
}
