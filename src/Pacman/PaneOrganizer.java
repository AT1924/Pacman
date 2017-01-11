package Pacman;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class PaneOrganizer {
	private BorderPane _root;
	private Pacman _pacman;
	private SmartSquare[][] _map;
	
	public PaneOrganizer(){
		_pacman = new Pacman();
		
		_root = new BorderPane();
		_root.setStyle("-fx-background-color: WHITE;");
		_root.setPrefSize(575,575);
		Pane pacmanPane = new Pane();
		Pacman pacman = new Pacman();
		_root.setCenter(pacmanPane);
		pacmanPane.isFocused();
		
		_map = new Board().get_map();
		
		Game game = new Game(pacmanPane);
		
//		for (int i = 0; i < _map.length; i++){
//			for (int j = 0; j < _map[i].length; j++){
//				
//			_root.getChildren().addAll(_map[i][j].getNode());
//								
//				
//				
//			}
//		}
//		
//		
//		_root.getChildren().add(_pacman.getNode());
	}
	
	public Pane getRoot(){
		return _root;
	}
	
}
