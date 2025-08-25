package boardgame;

public abstract class Piece {
	
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
	
	public abstract boolean[][] possibleMoves();
	// método concreto utilizando o abstrato "hook methods"
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMove() {
		boolean[][]mat = possibleMoves();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if(mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
}
