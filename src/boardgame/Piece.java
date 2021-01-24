package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	
	public Piece(Board board) {
		this.board = board;
		position = null; //Linha opcional, por padrão o java já atribui nulo quando não preenchido
	}


	protected Board getBoard() {
		return board;
	}
}
