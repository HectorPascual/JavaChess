package Pieces;

import Game.Board;
import Game.Player;

/**
 * Created by hector on 21/02/18.
 */
public class Pawn extends Piece {
    public Pawn(Player player) {
        super(player);
        name = "pawn";
    }

    @Override
    public void move(int x,int y, int x2, int y2) {
        /*Board.getBoard()[x][y] = null;
        Board.getBoard()[x2][y2] = this; //TEST*/

    }

    public boolean isMovePosible(int x1,int y1,int x2,int y2){  // check wether the move can be done or not
        x=x1;
        y=y1;
        boolean black = player.getType().getColour().equals("black");
        if((!black) && x == 6 && y == y2 && (x2-x) >= -2 ){ // first move with possibility of jump of two
            return true;
        }
        else if(y == y2 && (x2-x) == -1){ //basic move
            return true;
        }
        else if((black) && x == 1 && y == y2 && (x2-x) <= 2 ) return true;
        else if(y==y2 && (x2-x) == 1) return true;
        // to do : control not being able to get out the map
        else{
            return false;
        }
    }

}
