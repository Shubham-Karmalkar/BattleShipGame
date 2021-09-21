package InputTaker;

import Model.ShipPosition;
import Model.fields.Board;

import java.util.Scanner;

public class InputTakerConsole implements InputTaker {

    private Scanner scan = new Scanner(System.in);

    @Override
    public ShipPosition takeInputForShipType() {
        return null;
    }

    @Override
    public Board takeBoardType() {
        System.out.println("Select Type Of Board :- ");
        System.out.println("    1. Rectangle ");
    }
}
