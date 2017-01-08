package Pacman;

import javafx.scene.layout.Pane;

public class Game {
	private Pane pacmanPane;
	private SmartSquare[][] _map;
	
	public Game(Pane pacmanPane){
		pacmanPane.isFocused();
		pacmanPane.setFocusTraversable(true);
		this.pacmanPane = pacmanPane;
		//set up timeline here
		
		_map = new Board().get_map();
		
		for (int i = 0; i < 23; i++){
			for (int j = 0; j < 23; j++){
				
				pacmanPane.getChildren().add(_map[i][j].getNode());
				
				
				
			}
		}
		//pacmanPane.getChildren().add(_map.getNode());
		
	}

}
