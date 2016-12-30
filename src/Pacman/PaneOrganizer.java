package Pacman;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {
	private BorderPane _root;
	
	public PaneOrganizer(){
		_root = new BorderPane();
		_root.setStyle("-fx-background-color: WHITE;");
		_root.setPrefSize(800,600);
		Pane pacmanPane = new Pane();
		_root.setCenter(pacmanPane);
		pacmanPane.isFocused();
	//	_root.getChildren().add(pacmanPane);
	}
	
	public Pane getRoot(){
		return _root;
	}
	
}
