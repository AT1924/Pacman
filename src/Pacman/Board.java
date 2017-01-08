package Pacman;

import cs015.fnl.PacmanSupport.BoardLocation;
import cs015.fnl.PacmanSupport.SupportMap;
import javafx.scene.paint.Color;

public class Board {
	public SmartSquare[][] _map;
	
	//private SmartSquare _square;
	
	public Board(){
		cs015.fnl.PacmanSupport.SupportMap	stencilMap = new cs015.fnl.PacmanSupport.SupportMap();
		BoardLocation[][] tempMap = stencilMap.getMap();
		// find syntax for dereferencing the 2nd dimension of the 2d array
		_map = new SmartSquare[tempMap[0].length][tempMap[0].length];
		
		
		for (int i = 0; i < tempMap.length; i++){
			for (int j = 0; j < tempMap[i].length; j++){
				// create and place SmartSquare on board
				_map[i][j] = new SmartSquare(tempMap[i][j]);
				System.out.println(_map[i][j].getClass());
				
			}
		}
		
		}
	
	public static void main(String[] argv){
		Board b = new Board();
		int x = 0;
//		for (int i = 0; i < b._map.length; i++){
//			for (int j = 0; j < b._map[i].length; j++){
//			System.out.println(b._map[i][j].WALL());	
//			// create smartsquare
//			SmartSquare square = new SmartSquare(null);
//			// use information from b._map
//			square.setFill(Color.BLUE);
//			square.setX(b._map[i].length);
//			square.setY(b._map[j].length);
//			b._map[i][j].values();
//			b._map[i][j] = square.get_squares2();
//			
//			// insert smartsquare into board
//			// 
//			}
//		}
	}
	
	// potentially cruft
	public void setLocation(int row, int col, SmartSquare square){
		//create square at location row, col 
	
		_map[row][col] = square;
	}
	
	public void setMap(){
		Board b = new Board();
		
		for (int row = 0; row < 23; row++){
			for (int col = 0; col < 23; col++){
				if (_map = ){
					
				}
			}
		}
	}
	
	
	
}