package InputTaker;

import Model.Ship;
import Model.ShipPosition;
import Model.fields.Board;
import Model.fields.Coordinates;

public interface InputOutputTaker {
    ShipPosition takeInputForShipType();

    Board takeBoardType();

    Coordinates takeBoardSize(int ships, Ship[] ships1);

    String takeShipName();

    ShipPosition askShipSpecification();

    void printAllShips(Ship[] ships);

    void printBoardSize(Coordinates boardSize);

    void printGameDescription();

    void printAllShipsLocations(Ship[] ships);

    Coordinates askForTarget();

    int askForShipLength();

    String askTOPlayAgain();
}
