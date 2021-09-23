package Strategies;

import Model.fields.Board;
import Model.fields.Coordinates;

import java.util.ArrayList;

public class GenerateRandomPositionForL3 implements GenerateStartPosition {
    private Board board;

    @Override
    public Coordinates makeShipStartPoint(Board board){
        this.board = board ;
        int startPointX =  (int)((Math.random()*(board.getEndpoint().getX()-2))+1);
        int startPointY = (int)((Math.random()*(board.getEndpoint().getY()))+1) ;

        Coordinates startPoint = new Coordinates(startPointX,startPointY);

        return startPoint ;
    }

}
