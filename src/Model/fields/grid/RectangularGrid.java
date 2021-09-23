package Model.fields.grid;

import Model.fields.Coordinates;

import java.util.ArrayList;

public class RectangularGrid implements Grid{
    private ArrayList<ArrayList<Integer>> grid;

    @Override
    public ArrayList<ArrayList<Integer>> generateGrid(Coordinates coordinates) {

        grid = new ArrayList<>(coordinates.getX()+1);
        for(int i = 0 ;i<=coordinates.getX(); i++){
            grid.add(new ArrayList<Integer>(coordinates.getY()+1));
        }
        return grid;
    }
}
