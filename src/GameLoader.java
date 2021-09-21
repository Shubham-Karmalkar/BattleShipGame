import GameController.Jarvis;
import Model.Ship;

/* PrepCode
*   Requisites to start game
*        1. first we need to create ships and give then co-ordinates
*        2. Then we will ask user input (Guess) for the co-ordinate
*        3. Asking some method to check whether this guess is correct or not
*        4. And we will keep continuing until Game Ends
*/
public class GameLoader {
    private Jarvis jarvis = new Jarvis() ;

    public void startGame(){
        jarvis.GenerateBoard();
    }

}
