package Tests;
import Game.*;
/**
 * Created by hector on 21/02/18.
 */
public class Test {

    public static void main(String args[]){
        Game g = new Game();
        g.fillBoard();
        for(int i = 0; i<Board.sideSize;i++){
            for(int j=0;j<Board.sideSize;j++){
                System.out.print(g.getBoard().getBoard()[i][j] + ",");
            }
            System.out.println("");
        }
    }
}
