package InputTaker;

import Model.ShipPosition;
import Model.fields.Board;

public interface InputTaker {
    ShipPosition takeInputForShipType();

    Board takeBoardType();
}
