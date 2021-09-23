package Model.fields;

import Model.fields.grid.Grid;
import Model.fields.grid.RectangularGrid;

public class RectangularBoard implements Board {
    private Coordinates endPoint ;
    private Grid grid ;

    @Override
    public void setEndPoint(Coordinates endPoint) {
        this.endPoint = endPoint ;
    }

    @Override
    public void setGrid(Grid grid) {
        this.grid = grid ;
    }

    @Override
    public Coordinates getEndpoint() {
        return endPoint;
    }

    @Override
    public Grid getGrid() {
        return grid;
    }

    @Override
    public void makeBoard( Coordinates endPoint) {
        this.endPoint = endPoint;
        grid = new RectangularGrid();
        grid.generateGrid(endPoint);
    }

    @Override
    public boolean containsPoint( Coordinates coordinates) {
        if (coordinates.getX() <= 0 || coordinates.getY() <= 0) return false;
        else if (coordinates.getX()>endPoint.getX() || coordinates.getY()>endPoint.getY()) return false ;
        return true ;
    }
}
