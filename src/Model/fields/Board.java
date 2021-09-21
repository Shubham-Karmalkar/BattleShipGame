package Model.fields;

import Model.fields.grid.Grid;

public interface Board {
    Coordinates getEndpoint();
    Grid getGrid();
    void makeBoard(Coordinates coordinates);
    public boolean containsPoint(Coordinates coordinates);
}
