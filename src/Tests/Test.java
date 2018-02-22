package Tests;
import Game.*;
/**
 * Created by hector on 21/02/18.
 */
public class Test {

    public static void main(String args[]){
        Game g = new Game(false);
        g.fillBoard();
        printBoard(g);
        //if(!g.getPlayer1().move(1,1,1,3)) System.out.println("wrong move");
        if(!g.getPlayer2().move(6,1,4,1)) System.out.println("wrong move");
        if(!g.getPlayer1().move(1,2,3,2)) System.out.println("wrong move");
        if(!g.getPlayer2().move(6,5,3,5)) System.out.println("wrong move");
        printBoard(g);
    }

    public static void printBoard(Game g){
        for(int i = 0; i<Board.sideSize;i++){
            for(int j=0;j<Board.sideSize;j++){
                System.out.print(g.getBoard().getBoard()[i][j] + ",");
            }
            System.out.println("");
        }
        System.out.println("\n");
    }
}
