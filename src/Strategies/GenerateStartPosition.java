package Strategies;

import Model.fields.Board;
import Model.fields.Coordinates;

public interface GenerateStartPosition {
    public Coordinates makeShipStartPoint(Board board);
}
