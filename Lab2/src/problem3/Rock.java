package problem3;

class Rock extends Piece {
	
	public boolean isLegalMove(Position a, Position b) {
		// TODO Auto-generated constructor stub
		
		return a.x == b.x || a.y == b.y;
		
	}

}
