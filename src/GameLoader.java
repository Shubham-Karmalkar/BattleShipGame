import GameController.Jarvis;
import Model.Ship;
import Model.fields.Coordinates;

/* PrepCode
*   Requisites to start game
*        1. first we need to create ships and give then co-ordinates
*        2. Then we will ask user input (Guess) for the co-ordinate
*        3. Asking some method to check whether this guess is correct or not
*        4. And we will keep continuing until Game Ends
*/
public class GameLoader {
    private Jarvis jarvis = new Jarvis() ;
    private Ship[] ships = new Ship[3];
    private int attempt = 0 ;
    private int correctAttempt = 0;
    private int accuracy = 0 ;

    public void startGame(){
        int shipLength = jarvis.askForShipLength();
        jarvis.GenerateBoard(shipLength,ships);
        for (int i = 0 ; i<ships.length ; i++) {
            ships[i] = jarvis.makeShip();
        }
        jarvis.printAllShips(ships);
        jarvis.printBoardSize();
        jarvis.printGameDescription();
//        jarvis.printAllShipsLocations(ships);


        while(!jarvis.isAllShipsDead(ships)){
            Coordinates tempCoordinates = jarvis.askForTarget();
            String hitOrKill = jarvis.checkHitOrKill(tempCoordinates,ships) ;
            if(hitOrKill != ""){
                correctAttempt++;
                if(hitOrKill.equalsIgnoreCase("Hit")){
                    System.out.println("Congratulations it's a "+hitOrKill);
                }
                else {
                    System.out.println("Congratulations it's a "+hitOrKill);
                    System.out.println("You Sank "+"\""+jarvis.getLatestSankShipName()+"\"");
                }

            }else{
                System.out.println("You Missed");
            }
            attempt++;
        }

        accuracy = (correctAttempt*100/attempt) ;
        System.out.println("Congratulation you Won");
        System.out.println("Your Accuracy is : "+accuracy+" %");

    }

}
