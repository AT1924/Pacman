package Pacman;

import cs015.fnl.PacmanSupport.BoardLocation;
import cs015.fnl.PacmanSupport.SupportMap;
import javafx.scene.paint.Color;

public class Board {
	public BoardLocation[][] _map;
	
	//private SmartSquare _square;
	
	public Board(){
		cs015.fnl.PacmanSupport.SupportMap	stencilMap = new cs015.fnl.PacmanSupport.SupportMap();
		_map = stencilMap.getMap();
		//_square = new SmartSquare(_square.getLocation());
	}
	
	public static void main(String[] argv){
		Board b = new Board();
		for (int i = 0; i < b._map.length; i++){
			for (int j = 0; j < b._map[i].length; j++){
			System.out.println(b._map[i][j].values());	
			// create smartsquare
			SmartSquare square = new SmartSquare(null);
			// use information from b._map
			square.setFill(Color.BLUE);
			square.setX(b._map[i].length);
			square.setY(b._map[j].length);
			b._map[i][j].values();
			b._map[i][j] = square.get_squares2();
			
			// insert smartsquare into board
			// 
			}
		}
	}
	

	
}