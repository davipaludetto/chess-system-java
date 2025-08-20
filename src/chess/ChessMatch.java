package chess;

import boardgame.Board;

public class ChessMatch { // coração sistema com as regras do jogo
	 
	private Board board;
	
	public ChessMatch() {
		board = new Board (8, 8);
	}

	public ChessPiece[][] getPieces(){
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++){ // percorrer a matriz de peças do tabuleiro e fazer um downcasting para ChessPiece
			for (int j=0; j<board.getColumns(); j++){
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
	return mat;
	}
}
