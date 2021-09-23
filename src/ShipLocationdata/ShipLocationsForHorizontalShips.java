package ShipLocationdata;

import Model.fields.Coordinates;

import java.util.ArrayList;
import java.util.HashSet;

public class ShipLocationsForHorizontalShips implements ShipLocations {
    private ArrayList<Coordinates> shipLocationData = new ArrayList<>();

    public boolean contains(Coordinates coordinates, int length){
        for(int i = 0; i< shipLocationData.size() ;i++) {
            if(shipLocationData.get(i).getY() == coordinates.getY()) {
                for(int j = 0 ; j<length ; j++) {
                    if( shipLocationData.get(i).getX()+j == coordinates.getX() ) {
                        return true ;
                    }
                }
            }
        }
        shipLocationData.add(coordinates);
        return false ;
    }

}
