package Model;

import Model.fields.Coordinates;

import java.util.ArrayList;

public class ShipPositionForLength3RandomLogic implements ShipPositionForLength3{
    private ArrayList<Integer> location ;
    private Coordinates startPosition ;

    public void generateShip(Coordinates startPosition){
        this.startPosition = startPosition;
        location = new ArrayList<>(3);
        location.add(startPosition.getX());
        location.add(startPosition.getX()+1);
        location.add(startPosition.getX()+2);
    }

}
