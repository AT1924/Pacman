package Pacman;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Game {
	private Pane pacmanPane;
	private SmartSquare[][] _map;
	
	public Game(Pane pacmanPane){
		pacmanPane.isFocused();
		pacmanPane.setFocusTraversable(true);
		this.pacmanPane = pacmanPane;
		//set up timeline here
		
		_map = new Board().get_map();
		
		for (int i = 0; i < _map.length; i++){
			for (int j = 0; j < _map[i].length; j++){
				
//				pacmanPane.getChildren().add(_map[i][j].getNode());
				SmartSquare s = _map[i][j];
				s.setFill(Color.BLACK);
				pacmanPane.getChildren().add(s.getNode());
				
				
				
			}
		}
		//pacmanPane.getChildren().add(_map.getNode());
		
	}

}
