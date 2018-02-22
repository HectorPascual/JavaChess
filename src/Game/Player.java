package Game;
import Pieces.*;

import java.util.ArrayList;

/**
 * Created by hector on 21/02/18.
 */
public class Player {
    private final Type type;
    private ArrayList<Piece> pieces;
    private Board board;

    public Player(String colour, Board board){   //inside the constructor the initial pieces of a player are created

        type = new Type(colour);
        pieces = new ArrayList<>();
        this.board = board;

        for(int i = 0; i<8;i++){
            pieces.add(new Pawn(this));
        }
        //other pieces (we'll try first just with pawns)
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public Type getType() {
        return type;
    }

    public boolean move(int x1, int y1, int x2, int y2){    // returns true if the move has been done
        if(((Pawn)board.getBoard()[x1][y1]).isMovePosible(x1,y1,x2,y2)) { // checks if this mov can be done
            board.getBoard()[x2][y2] = board.getBoard()[x1][y1]; // moves the reference to the pice
            board.getBoard()[x1][y1] = null;    // assigns null where the piece was
            return true;
        }
        else{
            return false;
        }
    }

}
