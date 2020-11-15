import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import controllers.Game;
import controllers.GameMaker;
import mocks.MockReader;

public class GameMakerTest {

    @Test
    void testCreateGame() {
        // numOfColors, lengthCode, attempts
        int[][] responsesArray = {
            {4,4,4},
            {5,5,5},
            {8,8,8}
        };
        for (int[] response : responsesArray) {
            GameMaker gameMaker = new GameMaker(new MockReader(response));
            Game game = gameMaker.createGame();
            Assertions.assertEquals(response[0], game.getNumOfColors());
            Assertions.assertEquals(response[1], game.getLengthCode());
            Assertions.assertEquals(response[2], game.getAttempts());
        }
        
    }
       
    
}
