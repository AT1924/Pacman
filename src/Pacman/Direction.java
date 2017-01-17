package Pacman;

public enum Direction {
	LEFT, RIGHT, UP, DOWN;
	
	public Direction getOpposite(){
		
		switch(this){
		case LEFT: 
			return RIGHT;
		case RIGHT:	
			return LEFT;
		case UP:
			return DOWN;
		case DOWN:
			return UP;
		// this default case  might result in error, might have to make one of the cases default.
		default:
			return null;
		}
		
	}
	
}

	