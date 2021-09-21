package Model.fields;

public class Coordinates {
    private final int X ;
    private final int Y ;

    public Coordinates(int x, int y) {
        X = x;
        Y = y;
    }

    public void setCoordinates(int x,int y ) {
        int X = x ;
        int Y = y ;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y ;
    }

}
