package boardgame;

public class BoardException extends RuntimeException{
    private static final long SerialVersionUID = 1L;
    public BoardException(String msg){
        super(msg);
    }
}
