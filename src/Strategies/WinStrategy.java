package Strategies;

import Model.Ship;

public class WinStrategy {
    private Ship[] ships;

    public WinStrategy(Ship[] ships) {
        this.ships = ships;
    }

    public boolean isAllShipsDead(){
        for(int i= 0 ;i<ships.length ;i++){
            if (ships[i].getShipPosition().getLocation().size() != 0) {
                return false;
            }
        }
        return true;
    }
}
