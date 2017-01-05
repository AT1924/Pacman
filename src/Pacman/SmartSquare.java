package Pacman;

import java.util.ArrayList;

import cs015.fnl.PacmanSupport.BoardLocation;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SmartSquare {
	private Rectangle _rect;
	private BoardLocation _location;
	private ArrayList<SmartSquare> _squares;
	private SmartSquare[][] _squares2;
	public SmartSquare(BoardLocation location){
		_rect.setWidth(20);
		_rect.setHeight(20);
		_rect.setFill(Color.BLACK);
		_location = location;
		_squares = new ArrayList();
		_squares2 = new SmartSquare[Constants.NUM_SQUARES_Y][Constants.NUM_SQUARES_X];
	}
	
	public void squareContains(){
		
	}
	
	public BoardLocation getLocation(){
		return _location;
	}

	public ArrayList<SmartSquare> get_squares(){
		return _squares;
	}
	
	public SmartSquare[][] get_squares2(){
		return _squares2;
		
	}
	
	public void setX(double x){
		_rect.setX(x);
	}
	
	public void setY(double y){
		_rect.setY(y);
	}
	
	public void setFill(Color color){
		_rect.setFill(color);
	}
	
	
}
