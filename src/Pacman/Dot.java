package Pacman;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Dot implements SquareInterface{
	private Ellipse _ellipse;
	
	public Dot(){
		_ellipse = new Ellipse();
		_ellipse.setRadiusX(5);
		_ellipse.setRadiusY(5);
		_ellipse.setFill(Color.WHITE);
	}
	
	
	
}
