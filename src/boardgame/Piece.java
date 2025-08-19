package boardgame;

public class Piece {
	
	protected Position position;
	private Board board;
	
	
	public Piece(Board board) { 
		this.board = board;
		position = null; // posição peça recém criada
	}

	protected Board getBoard() {
		return board;
	}

	/* public void setBoard(Board board) {
		this.board = board; 				
	} Não podemos permitir que o tabuleiro seja alterado */
	

}
