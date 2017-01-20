package Pacman;

import cs015.fnl.PacmanSupport.BoardLocation;
import cs015.fnl.PacmanSupport.SupportMap;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class Board {
	public SmartSquare[][] _map;
	private BoardLocation _location;
	private SmartSquare _square;
	//private Pacman _pacman;
	private SmartSquare _pacmanCurrPos;
	private int _currPosX;
	private int _currPosY;
	private Dot _dot;
	
	public Board(){
		
		_dot = new Dot();
		
		
		//_location = new BoardLocation();
		cs015.fnl.PacmanSupport.SupportMap	stencilMap = new cs015.fnl.PacmanSupport.SupportMap();
		BoardLocation[][] tempMap = stencilMap.getMap();
		// find syntax for dereferencing the 2nd dimension of the 2d array
		_map = new SmartSquare[tempMap[0].length][tempMap[0].length];
		
		
		for (int i = 0; i < tempMap.length; i++){
			for (int j = 0; j < tempMap[i].length; j++){
				// create and place SmartSquare on board
				_map[i][j] = new SmartSquare(tempMap[i][j]);
				

				switch(tempMap[i][j]){
				case WALL:
					_map[i][j].setFill(Color.CORNFLOWERBLUE);
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					break;
					
				case FREE:
					_map[i][j].setFill(Color.BLACK); 
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					break;
				
				case DOT:
					// TODO change color after dots have been placed
					//_map[i][j].setFill(Color.INDIANRED);
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					_map[i][j].setDot(true);
					_dot.setCenterX(_map[i][j].getX()+Constants.SQUARE_SIZE/2);
					_dot.setCenterY(_map[i][j].getY()+Constants.SQUARE_SIZE/2);
					System.out.println(_dot.getCenterX());
					break;
					
				case ENERGIZER:
					// TODO change color after energizers have been placed 
					_map[i][j].setFill(Color.DARKOLIVEGREEN);
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					_map[i][j].setEnergizer(true) ;
					break;
					
				case PACMAN_START_LOCATION:
					// here _map[i][j] defines pacmans current position
					// we can create getter and setter in this class for this position 
					// and only one pacman will be created in Game
					_map[i][j].setFill(Color.YELLOW);
					_map[i][j].setPacman(true);
					_map[i][j].setX(j*Constants.SQUARE_SIZE);
					_map[i][j].setY(i*Constants.SQUARE_SIZE);
					_currPosX = i;
					_currPosY = j;
					_pacmanCurrPos = _map[i][j];
					// when pacman is an ellipse shift the the setCenters to the Game class
				//	_pacman.setCenterX(i);
				//	_pacman.setCenterY(j);
					
					break;
					
					
				
				default:
					System.out.println("");
				}
				
				
				
			}
		}
		
		}
	

	
	public SmartSquare get_pacmanCurrPos() {
		return _pacmanCurrPos;
	}



	public void set_pacmanCurrPos(SmartSquare _pacmanCurrPos) {
		this._pacmanCurrPos = _pacmanCurrPos;
	}



	// potentially cruft
	public void setLocation(int row, int col, SmartSquare square){
		//create square at location row, col 
	
		_map[row][col] = square;
	}
	

	
	public SmartSquare[][] get_map(){
		return _map;
	}
	
	
	public SmartSquare getSquare(int x, int y){
		return _map[x][y];
	}
	
}
	
	
	
