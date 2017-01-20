package Pacman;

import java.util.ArrayList;

import cs015.fnl.PacmanSupport.BoardLocation;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SmartSquare {
	private Rectangle _rect;
	private BoardLocation _location;
	private boolean _isWall = false;
	private boolean _containsPacman = false;
	private boolean _containsDot = false;
	private boolean _containsEnergizer = false;
	private double _xPos;
	private double _yPos;
	
	public SmartSquare(BoardLocation location){
		
		_rect = new Rectangle();
		_rect.setWidth(Constants.SQUARE_SIZE);
		_rect.setHeight(Constants.SQUARE_SIZE);
		_rect.setFill(Color.BLACK);
		
		// enum describing value of board location 
		_location = location;
		
		
		
	}
	// TODO Properly write this method 
	public boolean squareContains(BoardLocation givenLocation){
		return false;
		
		
	}
	
	
	public void setX(double x){
		_rect.setX(x);
	}
	
	public void setY(double y){
		_rect.setY(y);
	}
	
	public double getX(){
		return _rect.getX();
	}
	
	public double getY(){
		return _rect.getY();
	}
	
	
	public void setFill(Color color){
		_rect.setFill(color);
	}
	
	public Boolean get_isWall(){
		return _isWall;
	}
	
	public void set_isWall(Boolean b){
		_isWall = b;
	}
	
	public Node getNode(){
		return _rect;
	}
	
	public void setPacman(Boolean b){
		_containsPacman = b;
	}
	
	public void setDot(Boolean b){
		_containsDot = b;
	}
	
	public void setEnergizer(Boolean b){
		_containsEnergizer = b; 
	}
	
	public BoardLocation get_location(){
		return _location;
	}
	
	public double get_xPos() {
		return _xPos;
	}
	public void set_xPos(double _xPos) {
		this._xPos = _xPos;
	}
	public double get_yPos() {
		return _yPos;
	}
	public void set_yPos(double _yPos) {
		this._yPos = _yPos;
	}
	
	
}
