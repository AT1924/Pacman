package Pacman;

import cs015.fnl.PacmanSupport.BoardLocation;
import cs015.fnl.PacmanSupport.SupportMap;
import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Pacman extends Ellipse{
	private Ellipse _ellipse;
	private BoardLocation _location;
	private SmartSquare[][] _map;
	private BoardLocation[][] _tempMap;
	
	
	public Pacman(){
//		_ellipse = new Ellipse();
//		_ellipse.setRadiusX(Constants.PACMAN_RADIUS);
//		_ellipse.setRadiusY(Constants.PACMAN_RADIUS);
//		_ellipse.setFill(Color.YELLOW);
		this.setRadiusX(Constants.PACMAN_RADIUS);
		this.setRadiusY(Constants.PACMAN_RADIUS);
		this.setFill(Color.YELLOW);		
		
		_map = new Board().get_map();
		
		SupportMap tempMap = new SupportMap();
		_tempMap = tempMap.getMap();
	}
	
	public Ellipse getPacman(){
		return _ellipse;
	}
	
//	public void setXLoc(double x){
//		_ellipse.setCenterX(x);
//	}
//	
//	public void setYLoc(double y){
//		_ellipse.setCenterY(y);
//	}
//	
//	public double getXLoc(){
//		return _ellipse.getCenterX();
//	}
//	
//	public double getYLoc(){
//		return _ellipse.getCenterY();
//	}
	
	public Node getNode(){
		return _ellipse;
	}
	
	public Boolean canMoveLeft(){
		for (int i = 0; i < _tempMap.length; i++){
			for (int j = 0; j < _tempMap[i].length; j++){
				int x =  (int) (_ellipse.getCenterX()/Constants.SQUARE_SIZE);		
				int y = (int) (_ellipse.getCenterY()/Constants.SQUARE_SIZE);
				if (_tempMap[y][x-1] == _location.WALL){
					return false;
				}
			}
		}
		return true;
	}
	
	public Boolean canMoveRight(){
		for (int i = 0; i < _tempMap.length; i++){
			for (int j = 0; j < _tempMap[i].length; j++){
				int x =  (int) (_ellipse.getCenterX()/Constants.SQUARE_SIZE);		
				int y = (int) (_ellipse.getCenterY()/Constants.SQUARE_SIZE);
				if (_tempMap[y][x+1] == _location.WALL){
					return false;
				}
			}
		}
		return true;
	} 
	
	public Boolean canMoveDown(){
		for (int i = 0; i < _tempMap.length; i++){
			for (int j = 0; j < _tempMap[i].length; j++){
				int x =  (int) (_ellipse.getCenterX()/Constants.SQUARE_SIZE);		
				int y = (int) (_ellipse.getCenterY()/Constants.SQUARE_SIZE);
				if (_tempMap[y+1][x] == _location.WALL){
					return false;
				}
			}
		}
		return true;
	}
	
	public Boolean canMoveUp(){
		for (int i = 0; i < _tempMap.length; i++){
			for (int j = 0; j < _tempMap[i].length; j++){
				int x =  (int) (_ellipse.getCenterX()/Constants.SQUARE_SIZE);		
				int y = (int) (_ellipse.getCenterY()/Constants.SQUARE_SIZE);
				if (_tempMap[y-1][x] == _location.WALL){
					return false;
				}
			}
		}
		return true;
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
		
	}
	
	
	
	
}
