package Model;

import GameController.Jarvis;
import Model.fields.Coordinates;

import java.util.ArrayList;

/* Ship is a class Which according to our needs must hold following things
*   1. Name of the Ship (for user to understand which ship he destroyed)
*   2. Co-ordinates of ship (for this game we are considering ship has max length as 3)
*   3. And also we don't want our instance variables to be handled directly, so we used getter and setter
*/

public class Ship {
    private String name ;
    private ShipPosition shipPosition;
    private Jarvis jarvis;


    public void Ship(String  name ) {
        this.name = name ;
        jarvis = new Jarvis();
        shipPosition = jarvis.generateShipPosition();
    }

}
