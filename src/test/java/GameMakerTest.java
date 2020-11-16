import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import controllers.Game;
import controllers.GameMaker;
import mocks.MockReader;

public class GameMakerTest {

    /*Test de Caixa Blanca:
     * Decision Coverage que prova les dues opcions CodeMaker (Usuari o Computer)*/
    @Test
    void testCreateGame() {
        // numOfColors, lengthCode, attempts
        int[][] responsesArray = {
            {4,4,4},
            {5,5,5},
            {8,8,8}
        };

        //Typical use case with CodeMakerComputer
        for (int[] response : responsesArray) {
            GameMaker gameMaker = new GameMaker(new MockReader(response,true));
            Game game = gameMaker.createGame();
            Assertions.assertEquals(response[0], game.getNumOfColors());
            Assertions.assertEquals(response[1], game.getLengthCode());
            Assertions.assertEquals(response[2], game.getAttempts());
        }

        //Typical use case with CodeMakerUser
        for (int[] response : responsesArray) {
            GameMaker gameMaker = new GameMaker(new MockReader(response,false));
            Game game = gameMaker.createGame();
            Assertions.assertEquals(response[0], game.getNumOfColors());
            Assertions.assertEquals(response[1], game.getLengthCode());
            Assertions.assertEquals(response[2], game.getAttempts());
        }
        
    }
       
    
}
