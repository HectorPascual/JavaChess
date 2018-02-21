package Pieces;

import Game.Player;

/**
 * Created by hector on 21/02/18.
 */
public abstract class Piece {

    private Player player;
    protected String name;

    public Piece(Player player){

        this.player = player;
    }

    public String toString(){
        return name;
    }

}
