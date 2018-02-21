package Game;
import Pieces.*;
/**
 * Created by hector on 21/02/18.
 */
public class Board{
    public static final int sideSize = 8; // Size of the board sides
    private Piece[][] board;        // Matrix of pieces currently existing on the board
    public Board(){
        board = new Piece[8][8];    // initializes the board as a Matrix of 8x8
    }

    public Piece[][] getBoard() {   // returns the board Pieces Matrix
        return board;
    }
}
