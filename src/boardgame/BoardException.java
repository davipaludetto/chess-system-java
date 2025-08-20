package boardgame;

public class BoardException extends RuntimeException{ // programação defensiva
	private static final long serialVersionUID = 1L;
	
	public BoardException(String msg) {
		super(msg);
	}

}
