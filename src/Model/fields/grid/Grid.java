package Model.fields.grid;

import Model.fields.Coordinates;

import java.util.ArrayList;

public interface Grid {
    ArrayList<ArrayList<Integer>> generateGrid(Coordinates coordinates);
}
