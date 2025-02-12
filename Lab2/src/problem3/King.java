package problem3;

class King extends Piece{

	public boolean isLegalMove(Position a, Position b) {
		// TODO Auto-generated constructor stub
		
		int dx = Math.abs(a.x - b.x);
		int dy = Math.abs(a.y - b.y);
		return dx <= 1 && dy <= 1;
		
	}

}
