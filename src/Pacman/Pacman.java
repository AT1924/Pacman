package Pacman;

import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Pacman extends Ellipse{
	private Ellipse _ellipse;
	
	
	public Pacman(){
//		_ellipse = new Ellipse();
//		_ellipse.setRadiusX(Constants.PACMAN_RADIUS);
//		_ellipse.setRadiusY(Constants.PACMAN_RADIUS);
//		_ellipse.setFill(Color.YELLOW);
		this.setRadiusX(Constants.PACMAN_RADIUS);
		this.setRadiusY(Constants.PACMAN_RADIUS);
		this.setFill(Color.YELLOW);		
		
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
	//
}
