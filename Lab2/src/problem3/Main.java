package problem3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Position position1 = new Position(3, 4);
		Position position2 = new Position(3, 7);
		
		Piece rock = new Rock();
		Piece king = new King();
		
		boolean isRockMoveValid = rock.isLegalMove(position1, position2);
		boolean isKingMoveValid = king.isLegalMove(position1, position2);
		
		System.out.println(isRockMoveValid);
		System.out.println(isKingMoveValid);
		
	}

}
