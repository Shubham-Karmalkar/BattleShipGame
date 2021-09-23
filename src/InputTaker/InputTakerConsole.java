package InputTaker;

import Model.Ship;
import Model.ShipPosition;
import Model.ShipPositionForLength3RandomLogic;
import Model.fields.Board;
import Model.fields.Coordinates;
import Model.fields.RectangularBoard;

import java.util.Scanner;

public class InputTakerConsole implements InputOutputTaker {

    private Scanner scan = new Scanner(System.in);

    @Override
    public ShipPosition takeInputForShipType() {
        return null;
    }

    @Override
    public Board takeBoardType() {
        System.out.println("Select Type Of Board :- ");
        System.out.println("    Enter 1 for 'Rectangle' ");
        Board board;
        int i;
        try {
             i = Integer.parseInt(scan.next());
        }
        catch (Exception e){
            System.out.println("Not a number Enter again");
            return takeBoardType();
        }
        switch (i){
            case 1 : board =  new RectangularBoard();
            break;
            default:
                System.out.println("Enter right number");
                return takeBoardType();
        }
        return board ;

    }

    @Override
    public Coordinates takeBoardSize(int shipslength, Ship[] ships) {
        System.out.println("Enter the Board Size in Row X Column form");
        System.out.println("Enter Number of Rows : ");
        Coordinates coordinates;
        int row = 0 ;
        int column = 0;

        while(true){
            boolean b = true;
            try {
                row = Integer.parseInt(scan.next());
            }catch (Exception e){
                System.out.println("Not a Number Enter Again");
                b = false;
            }
            if(row < (shipslength+2) && b ){
                System.out.println("Row must be greater than "+(shipslength+1));
                b = false;
            }
            if(b){
                break;
            }
        }
        System.out.println("Enter Number of Columns : ");
        while (true){
            boolean b = true ;
            try{
                column = Integer.parseInt(scan.next());
            }catch (Exception e){
                System.out.println("Not a Number Enter Again");
                b = false;
            }
            if(column < ships.length && b ){
                System.out.println("Column must be greater than "+ships.length);
                b = false;
            }
            if(b){
                break;
            }
        }
        coordinates = new Coordinates(row,column);
        return coordinates;
    }

    @Override
    public String takeShipName() {
        System.out.println("Enter Ship Name : ");
        scan.nextLine();
        String name = scan.nextLine();
        return name;
    }

    @Override
    public ShipPosition askShipSpecification() {
        System.out.println("Enter Type of Ship you Want :-");
        System.out.println("   -Enter 1 for Default Ship");
//      System.out.println("    Enter 2 for Custom Ship");
        ShipPosition shipPosition ;
        int i =  0;
        try{
            i = Integer.parseInt(scan.next());
        }
        catch(Exception e){

            System.out.println("Not a number Enter again");
            return askShipSpecification();
        }
        switch (i){
            case 1 : shipPosition = new ShipPositionForLength3RandomLogic();
            break;
            default:
                System.out.println("Enter right Number");
                return askShipSpecification();
        }

        return shipPosition;
    }

    @Override
    public void printAllShips(Ship[] ships) {
        System.out.println("You got total "+ships.length+" Ships as below");
        for(int i = 0 ;i < ships.length ;i++){
            System.out.println("Ship "+(i+1)+" : "+ships[i].getName());
        }
    }

    @Override
    public void printBoardSize(Coordinates boardSize) {
        System.out.println("You got Board of Size : "+boardSize.getX()+" X "+boardSize.getY());
    }

    @Override
    public void printGameDescription() {
        System.out.println();
        System.out.println("Do you want to see Game Description? Y/N");
        String ch =  scan.next();
        if(!ch.equalsIgnoreCase("y")) return ;
        System.out.println();
        System.out.println("Game Description is as follows :");
        System.out.println("1. You have given ships with name but you don't know location.");
        System.out.println("2. So you have to predict location of ship.");
        System.out.println("3. Prediction shall be done by giving X and Y Coordinate of location.");
        System.out.println("4. Location of a ship is continues for example :- \n \t if ship has length 3" +
                " then coordinates might have pattern like (3,2),(4,2),(5,2) \n \t like this ship will be continues.");
        System.out.println("5. And you have to write coordinates like wise by Prediction.");
        System.out.println("6. Once you hit ship we will print \"Hit\" and if you hit all coordinates of a ship we will print \"Kill\"." );
        System.out.println("7. Like wise you have to kill all ships.");
        System.out.println("8. We will also give you your prediction accuracy.");

    }

    @Override
    public void printAllShipsLocations(Ship[] ships) {
        for (int i = 0;i< ships.length ;i++) {
            for (int j = 0 ;j<ships[i].getShipPosition().getLocation().size() ; j++)
            System.out.print("[ "+ships[i].getShipPosition().getLocation().get(j).getX()+" , "+ships[i].getShipPosition().getLocation().get(j).getY()+" ]");
        }
        System.out.println();
    }

    @Override
    public Coordinates askForTarget() {
        System.out.println();
        System.out.println("Enter your target Location");
        Coordinates coordinates;
        int x = 0 ;
        while(true){
            System.out.println("X : ");
            boolean b = true;
            try{
                x = Integer.parseInt(scan.next());
            }catch (Exception e){
                System.out.println("Not a Number Enter Valid Number");
                b = false;
            }
            if(b) break;
        }
        int y = 0 ;
        while (true){
            System.out.println("Y : ");
            boolean b = true;
            try {
                y = Integer.parseInt(scan.next());
            }catch (Exception e){
                System.out.println("Not a Number Enter Valid Number");
                b = false;
            }
            if(b) break ;
        }

        coordinates = new Coordinates(x,y);

        return coordinates;
    }

    @Override
    public int askForShipLength() {
        //System.out.println("Enter ship length that you want ");
        int length = 3 ;
//        try{
//            length = Integer.parseInt(scan.next());
//        }catch (Exception e){
//            System.out.println("Not a Proper Number");
//            return askForShipLength();
//        }
        return  length ;
    }
}
