package Pacman;


import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;


public class Game {
	private Pane pacmanPane;
	private SmartSquare[][] _map;
	private Pacman _pacman;
	public Game(Pane pacmanPane, Pacman pacman){
		pacmanPane.isFocused();
		pacmanPane.setFocusTraversable(true);
		this.pacmanPane = pacmanPane;
		this._pacman = pacman; 
		//set up timeline here
		
		_map = new Board().get_map();
		
		for (int i = 0; i < _map.length; i++){
			for (int j = 0; j < _map[i].length; j++){
				
			pacmanPane.getChildren().addAll(_map[i][j].getNode());
								
				
				
			}
		}
		//pacmanPane.getChildren().add(_map.getNode());
		
	}

}
