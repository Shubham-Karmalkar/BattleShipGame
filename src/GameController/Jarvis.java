package GameController;

/* Jarvis :- Jarvis is our basically a class which is working like an Intermediary between requirement and execution.
*  (Jarvis is serving as a Waiter to GameLoader where game is loading and location where actual work is getting done )
*  To serve such a huge responsibly it must have the following things
*   1. it must be connected to all the classes which are requires to do some work
*   2. */

import InputTaker.InputOutputTaker;
import Model.Ship;
import Model.ShipPosition;
import InputTaker.InputTakerConsole ;
import Model.fields.Board;
import Model.fields.Coordinates;
import Model.fields.grid.Grid;
import ShipLocationdata.ShipLocationsForHorizontalShips;
import Strategies.GenerateRandomPositionForL3;
import Strategies.GenerateStartPosition;
import Strategies.HitOrKillStrategy;
import Strategies.WinStrategy;


public class Jarvis {
    private InputOutputTaker inputTaker = new InputTakerConsole();
    private GenerateStartPosition generateStartPosition = new GenerateRandomPositionForL3();
    private Board board ;
    private Grid grid ;
    private Coordinates boardSize;
    private WinStrategy winStrategy;
    private HitOrKillStrategy hitOrKillStrategy = new HitOrKillStrategy();
    private ShipLocationsForHorizontalShips shipLocations = new ShipLocationsForHorizontalShips();
//    public ShipPosition generateShipPosition() {
//        shipPosition =  inputTaker.takeInputForShipType();
//    }

    public void GenerateBoard(int shiplength, Ship[] ships) {
        board = inputTaker.takeBoardType();
        boardSize = inputTaker.takeBoardSize(shiplength,ships);
//        while(boardSize.getX() <   )
        board.makeBoard(boardSize);
    }

    public Ship makeShip() {
        Ship ship ;
        ShipPosition shipPosition ;
        String shipName = inputTaker.takeShipName();
        shipPosition = inputTaker.askShipSpecification();
        Coordinates startPosition = generateStartPosition.makeShipStartPoint(board);
        while (shipLocations.contains(startPosition, shipPosition.getLength())){
            startPosition = generateStartPosition.makeShipStartPoint(board);
        }
        shipPosition.generateShip(startPosition);
        ship = new Ship(shipName,shipPosition);
        return ship ;
    }

    public void printAllShips(Ship[] ships) {

        inputTaker.printAllShips(ships);
    }

    public void printBoardSize() {
        inputTaker.printBoardSize(boardSize);
    }

    public void printGameDescription() {
        inputTaker.printGameDescription();
    }

    public void printAllShipsLocations(Ship[] ships) {
        inputTaker.printAllShipsLocations(ships);
    }

    public boolean isAllShipsDead(Ship[] ships) {
        winStrategy = new WinStrategy(ships);
        return winStrategy.isAllShipsDead();
    }

    public Coordinates askForTarget() {
        return  inputTaker.askForTarget();
    }

    public String checkHitOrKill(Coordinates tempCoordinates, Ship[] ships) {
        if(board.containsPoint(tempCoordinates)){
            return hitOrKillStrategy.checkHitOrKill(tempCoordinates,ships);

        }else{
            return "" ;
        }
    }

    public String getLatestSankShipName() {
        Ship ship = hitOrKillStrategy.getLatestKilledShip();
        return ship.getName();
    }

    public int askForShipLength() {
        return inputTaker.askForShipLength();
    }
}
