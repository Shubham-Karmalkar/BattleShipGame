package Model.fields;

import Model.fields.grid.Grid;

public interface Board {
    void setEndPoint(Coordinates coordinates);
    void setGrid(Grid grid);
    Coordinates getEndpoint();
    Grid getGrid();
    void makeBoard(Coordinates coordinates);
    public boolean containsPoint(Coordinates coordinates);
}
