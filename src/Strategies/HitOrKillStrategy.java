package Strategies;

import Model.Ship;
import Model.fields.Coordinates;

import java.util.Stack;

public class HitOrKillStrategy {
    Stack<Ship> killedShips = new Stack<>();

    public String checkHitOrKill(Coordinates tempCoordinates, Ship[] ships) {
        for(int i = 0; i< ships.length ; i++){
            if(ships[i].getShipPosition().hasThisPoint(tempCoordinates)){
                ships[i].getShipPosition().removePoint(tempCoordinates);
                if(ships[i].getShipPosition().getLocation().size() == 0){
                    killedShips.push(ships[i]) ;
                    return "Kill" ;
                }else{
                    return "Hit" ;
                }
            }
        }
        return "" ;
    }

    public Ship getLatestKilledShip() {
        return killedShips.peek();
    }
}
