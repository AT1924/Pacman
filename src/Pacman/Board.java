package Pacman;

import cs015.fnl.PacmanSupport.BoardLocation;
import cs015.fnl.PacmanSupport.SupportMap;

public class Board {
	public BoardLocation[][] _map ;
	
	public Board(){
		cs015.fnl.PacmanSupport.SupportMap	_stencilMap = new cs015.fnl.PacmanSupport.SupportMap();
		_map = _stencilMap.getMap();
	}
	
	public static void main(String[] argv){
		Board b = new Board();
		for (int i = 0; i < b._map.length; i++){
			for (int j = 0; j < b._map[i].length; j++){
			System.out.println(b._map[i][j].values());	
			// create smartsquare
			// use information from b._map 
			// insert smartsquare into board
			// 
			}
		}
	}
	

	
}