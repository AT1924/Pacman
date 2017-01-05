package Pacman;

import java.util.ArrayList;

import cs015.fnl.PacmanSupport.BoardLocation;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class SmartSquare {
	private Rectangle _rect;
	private BoardLocation _location;
	private boolean isWall;
	
	public SmartSquare(BoardLocation location){
		_rect = new Rectangle();
		_rect.setWidth(20);
		_rect.setHeight(20);
		_rect.setFill(Color.BLACK);
		
		// enum describing value of board location 
		_location = location;
		
		
		
	}
	// TODO Properly write this method 
	public boolean squareContains(BoardLocation givenLocation){
		return false;
		
		
	}
	
	
//	public void setX(double x){
//		_rect.setX(x);
//	}
//	
//	public void setY(double y){
//		_rect.setY(y);
//	}
	
	public void setFill(Color color){
		_rect.setFill(color);
	}
	
	
}
