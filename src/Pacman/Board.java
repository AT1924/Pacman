package Pacman;

import cs015.fnl.PacmanSupport.BoardLocation;
import cs015.fnl.PacmanSupport.SupportMap;
import javafx.scene.paint.Color;

public class Board {
	public SmartSquare[][] _map;
	private BoardLocation _location;
	private SmartSquare _square;
	private Pacman _pacman;
	
	public Board(){
		_pacman = new Pacman();
		
		//_location = new BoardLocation();
		cs015.fnl.PacmanSupport.SupportMap	stencilMap = new cs015.fnl.PacmanSupport.SupportMap();
		BoardLocation[][] tempMap = stencilMap.getMap();
		// find syntax for dereferencing the 2nd dimension of the 2d array
		_map = new SmartSquare[tempMap[0].length][tempMap[0].length];
		
		
		for (int i = 0; i < tempMap.length; i++){
			for (int j = 0; j < tempMap[i].length; j++){
				// create and place SmartSquare on board
				_map[i][j] = new SmartSquare(tempMap[i][j]);
				//System.out.println(_map[i][j]);
//				if (tempMap[i][j] == _location.WALL){
//					_map[i][j].setFill(Color.BLUE);
//					//_map[i][j].get_isWall(); 
//					
//				}
//				if (tempMap[i][j] == _location.FREE){
//					_map[i][j].setFill(Color.BLACK);
//				}
//				else{
//					//not a wall
//					System.out.println("");
//				}
				switch(tempMap[i][j]){
				case WALL:
					_map[i][j].setFill(Color.CORNFLOWERBLUE);
					_map[i][j].get_isWall();
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					break;
					
				case FREE:
					_map[i][j].setFill(Color.BLACK); 
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					break;
				
				case DOT:
					_map[i][j].setFill(Color.INDIANRED);
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					break;
					
				case ENERGIZER:
					_map[i][j].setFill(Color.DARKOLIVEGREEN);
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					break;
					
				case PACMAN_START_LOCATION:
					_map[i][j].setFill(Color.BLACK);
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					_pacman.setXLoc(_map[i][j].getX());
					_pacman.setYLoc(_map[i][j].getY());
					break;
					
				
				default:
					System.out.println("");
				}
			
				//_map[i][j] = new SmartSquare(tempMap[i][j]);
				//if (_map[i][j] == _location.WALL)
				//System.out.println(_map[i][j]);
				if(i == 22 && j == 22){
					System.out.println("");
				}
				
				
			}
		}
		
		}
	
//	public static void main(String[] argv){
//		Board b = new Board();
//		int x = 0;
//		for (int i = 0; i < b._map.length; i++){
//			for (int j = 0; j < b._map[i].length; j++){
//				if (_map[i][j] = )
//			}
//		}
//	}
	
	// potentially cruft
	public void setLocation(int row, int col, SmartSquare square){
		//create square at location row, col 
	
		_map[row][col] = square;
	}
	
	public void setMap(){
		Board b = new Board();
		
		for (int row = 0; row < 23; row++){
			for (int col = 0; col < 23; col++){
			//	if (_map){
					
				}
			}
		}
	
	public SmartSquare[][] get_map(){
		return _map;
	}
	
}
	
	
	
