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
    private String status = "alive" ;


    public Ship(String  name , ShipPosition shipPosition) {
        this.name = name ;
        this.shipPosition = shipPosition ;
    }

    public ShipPosition getShipPosition() {
        return shipPosition;
    }

    public void setShipPosition(ShipPosition shipPosition) {
        this.shipPosition = shipPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
