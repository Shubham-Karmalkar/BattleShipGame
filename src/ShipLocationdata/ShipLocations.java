package ShipLocationdata;

import Model.fields.Coordinates;

import java.util.HashSet;

public class ShipLocations {
    private HashSet<Coordinates> shipLocationData = new HashSet<>();

    public boolean contains(Coordinates coordinates){
        if(!shipLocationData.contains(coordinates))
        {
            shipLocationData.add(coordinates);
            return false;
        }else{
            return  true ;
        }
    }

}
