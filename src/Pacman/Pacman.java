package Pacman;

import cs015.fnl.PacmanSupport.BoardLocation;
import cs015.fnl.PacmanSupport.SupportMap;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Pacman extends Ellipse{
	private Ellipse _ellipse;
	private BoardLocation _location;
	private SmartSquare _currentPos;
	
	//direction to move Pacman
	private String direction;
	
	
	public Pacman(SmartSquare currentPos){
//		_ellipse = new Ellipse();
//		_ellipse.setRadiusX(Constants.PACMAN_RADIUS);
//		_ellipse.setRadiusY(Constants.PACMAN_RADIUS);
//		_ellipse.setFill(Color.YELLOW);
		this.setRadiusX(Constants.PACMAN_RADIUS);
		this.setRadiusY(Constants.PACMAN_RADIUS);
		this.setFill(Color.YELLOW);		
		_currentPos = currentPos;
		
		
	//set pacman's direction
		direction = "";
	}
	
	
	public String getDirection() {
		return direction;
	}


	public void setDirection(String direction) {
		this.direction = direction;
	}


	public Ellipse getPacman(){
		return _ellipse;
	}
	
	
	public Node getNode(){
		return _ellipse;
	}
	
	
	public SmartSquare get_currentPos() {
		return _currentPos;
	}


	public void set_currentPos(SmartSquare _currentPos) {
		this._currentPos = _currentPos;
	}


	public void moveLeft(){
		_ellipse.setCenterX(_ellipse.getCenterX()-Constants.SQUARE_SIZE);
		_ellipse.setCenterY(_ellipse.getCenterY());
	}
	
	public void moveRight(){
		_ellipse.setCenterX(_ellipse.getCenterX()+Constants.SQUARE_SIZE);
		_ellipse.setCenterY(_ellipse.getCenterY());
	}
	
	public void moveUp(){
		_ellipse.setCenterX(_ellipse.getCenterX());
		_ellipse.setCenterY(_ellipse.getCenterY() - Constants.SQUARE_SIZE);
	}
	
	public void moveDown(){
		_ellipse.setCenterX(_ellipse.getCenterX());
		_ellipse.setCenterY(_ellipse.getCenterY() + Constants.SQUARE_SIZE);
	}
	
	
	
	
	
	
}
