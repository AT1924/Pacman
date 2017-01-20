package Pacman;

import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Dot extends Ellipse{
	private Ellipse _ellipse;
	
	public Dot(){
		//_ellipse = new Ellipse();
		this.setRadiusX(5);
		this.setRadiusY(5);
		this.setFill(Color.WHITE);
	}
	
	
	
}
