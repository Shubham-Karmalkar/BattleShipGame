package Model;

import Model.fields.Coordinates;

import java.util.ArrayList;

public class ShipPositionForLength3RandomLogic implements ShipPositionForLength3{
    private ArrayList<Coordinates> location ;
    private Coordinates startPosition ;
    private int length  = 3 ;

    public void generateShip(Coordinates startPosition){
        this.startPosition = startPosition;
        location = new ArrayList<>(3);
        location.add(new Coordinates(startPosition.getX(),startPosition.getY()));
        location.add(new Coordinates(startPosition.getX()+1,startPosition.getY()));
        location.add(new Coordinates(startPosition.getX()+2,startPosition.getY()));
    }

    public int getLength() {
        return length;
    }

    public Coordinates getStartPosition() {
        return startPosition;
    }
    public ArrayList<Coordinates> getLocation(){
        return  location;
    }

    public boolean hasThisPoint(Coordinates coordinates){
        for(int i = 0 ;i <location.size(); i++){
            if(location.get(i).getX()==coordinates.getX() && location.get(i).getY() == coordinates.getY()){
                return true;
            }
        }
        return false ;
    }
    public void removePoint(Coordinates coordinates){
        for(int i = 0 ;i <location.size(); i++){
            if(location.get(i).getX()==coordinates.getX() && location.get(i).getY() == coordinates.getY()){
                location.remove(i);
            }
        }
    }
}
