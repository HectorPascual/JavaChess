package Pieces;

import Game.Player;

/**
 * Created by hector on 21/02/18.
 */
public abstract class Piece {

    protected Player player;
    protected int x,y;
    protected String name;

    public Piece(Player player){

        this.player = player;
    }

    public String toString(){
        return name;
    }

    public abstract void move(int x,int y, int x2, int y2);

}
