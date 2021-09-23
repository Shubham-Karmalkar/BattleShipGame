package Model.fields;

public class Coordinates {
    private final int X ;
    private final int Y ;

    public Coordinates(int x, int y) {
        X = x;
        Y = y;
    }

    public void setCoordinatesX(int x) {
        int X = x ;
    }
    public  void setCoordinatesY(int y) {
        int Y = y ;
    }
    public int getX() {
        return X;
    }
    public int getY() {
        return Y ;
    }

}
