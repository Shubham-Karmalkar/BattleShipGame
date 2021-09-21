package GameController;

/* Jarvis :- Jarvis is our basically a class which is working like an Intermediary between requirement and execution.
*  (Jarvis is serving as a Waiter to GameLoader where game is loading and location where actual work is getting done )
*  To serve such a huge responsibly it must have the following things
*   1. it must be connected to all the classes which are requires to do some work
*   2. */

import InputTaker.InputTaker;
import Model.ShipPosition;
import InputTaker.InputTakerConsole ;
import Model.fields.Board;
import Strategies.GenerateRandomPositionForL3;
import Strategies.GenerateStartPosition;


public class Jarvis {
    private ShipPosition shipPosition ;
    private InputTaker inputTaker = new InputTakerConsole();
    private GenerateStartPosition startPosition = new GenerateRandomPositionForL3();
    private Board board ;
    public ShipPosition generateShipPosition() {
        shipPosition =  inputTaker.takeInputForShipType();
    }

    public void GenerateBoard() {
        board = inputTaker.takeBoardType();
    }
}
