package Game;
import Pieces.*;
/**
 * Created by hector on 21/02/18.
 */
public class Game {
    private Player player1;
    private Player player2;
    private Board board;


    public Game(){
        if (Math.random() > 0.5) {      //  Assigns a random color to each player (between black and white)
            player1 = new Player("black");
            player2 = new Player("white");
        } else {
            player1 = new Player("white");
            player2 = new Player("black");
        }
        board = new Board();
    }


    public void fillBoard(){ // fills the board with each player pieces
        for(int i = 0; i<Board.sideSize;i++){   //filling pawns
            board.getBoard()[1][i] = player1.getPieces().get(i);
            board.getBoard()[6][i] = player2.getPieces().get(i);
        }
    }

    public Board getBoard() {
        return board;
    }
}
