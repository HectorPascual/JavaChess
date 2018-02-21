package Game;
import Pieces.*;

import java.util.ArrayList;

/**
 * Created by hector on 21/02/18.
 */
public class Player {
    private final Type type;
    private ArrayList<Piece> pieces;

    public Player(String colour){   //inside the constructor the initial pieces of a player are created
        type = new Type(colour);
        pieces = new ArrayList<>();

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
}
