package Model;

import Model.fields.Coordinates;

import java.util.ArrayList;

public interface ShipPosition {
    void generateShip(Coordinates startPosition);

    int getLength();
    ArrayList<Coordinates> getLocation();
    Coordinates getStartPosition();
    public boolean hasThisPoint(Coordinates coordinates) ;

    void removePoint(Coordinates tempCoordinates);
}
