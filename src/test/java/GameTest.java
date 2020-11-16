import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import controllers.CodeBreaker;
import controllers.CodeMaker;
import controllers.CodeMakerComputer;
import controllers.Game;
import core.Board;
import core.Code;
import mocks.mockCodeBreaker;
import mocks.mockCodeMakerComputer;
import ui.Reader;



public class GameTest {

    /*Test de Caixa Negra:
     * Particions equivalents (invalides) */
    @Test
    void it_should_throw_RuntimeException_when_Game_is_invalid() {
        CodeMaker codeMaker1 = new CodeMakerComputer(5,5);
        CodeBreaker codeBreaker1 = new CodeBreaker(4, 5, new Reader());

        // codeMaker.getLengthCode() != codeBreaker.getLengthCode()
        Assertions.assertThrows(RuntimeException.class,() -> new Game(codeMaker1,codeBreaker1,5));
        CodeMaker codeMaker2 = new CodeMakerComputer(4,6);

        // codeMaker.getNumberOfColors() != codeBreaker.getNumOfColors()
        Assertions.assertThrows(RuntimeException.class,() -> new Game(codeMaker2,codeBreaker1,5));
        
        // attempts <= 0
        CodeMaker codeMaker3 = new CodeMakerComputer(4, 5);
        Assertions.assertThrows(RuntimeException.class,() -> new Game(codeMaker3,codeBreaker1,0));
        Assertions.assertThrows(RuntimeException.class,() -> new Game(codeMaker3,codeBreaker1,-1));
    }
    /*Test de Caixa Blanca:
     * Loop testing
     * (comprobem diferents casos en que sortim guanyant)
     * Condition Coverage  (la totalitat d'aquest test i el seguent)
     * (ja que posem 1a condicio a true i segona a false o viceversa)*/

    @Test
    void testGame_that_you_win_on_different_attempts(){
        Code secretCode = new Code(new int[]{0,1,2,3});
        CodeMaker codeMaker = new mockCodeMakerComputer(4, secretCode);

        // On first attempt
        Code[] guesses =  {
            new Code(new int[]{0,1,2,3})
        };
        CodeBreaker codeBreaker1 = new mockCodeBreaker(4, 4, guesses);
        Game game1 = new Game(codeMaker, codeBreaker1, 4);
        game1.start();
        Assertions.assertTrue(game1.hasCodeBreakerWon());
        Assertions.assertFalse(game1.hasCodeBreakerLost());
        Assertions.assertTrue(game1.isGameOver());

        // On second attempt
        Code[] guesses2 =  {
            new Code(new int[]{1,1,1,1}),
            new Code(new int[]{0,1,2,3})
        };
        CodeBreaker codeBreaker2 = new mockCodeBreaker(4, 4, guesses2);
        Game game2 = new Game(codeMaker, codeBreaker2, 4);
        game2.start();
        Assertions.assertTrue(game2.hasCodeBreakerWon());
        Assertions.assertFalse(game2.hasCodeBreakerLost());
        Assertions.assertTrue(game2.isGameOver());

        // On third attempt
        Code[] guesses3 =  {
            new Code(new int[]{1,1,1,1}),
            new Code(new int[]{0,1,1,3}),
            new Code(new int[]{0,1,2,3})
        };
        CodeBreaker codeBreaker3 = new mockCodeBreaker(4, 4, guesses3);
        Game game3 = new Game(codeMaker, codeBreaker3, 4);
        game3.start();
        Assertions.assertTrue(game3.hasCodeBreakerWon());
        Assertions.assertFalse(game3.hasCodeBreakerLost());
        Assertions.assertTrue(game3.isGameOver());

        // On last attempt
        Code[] guesses4 =  {
            new Code(new int[]{1,1,1,1}),
            new Code(new int[]{0,1,1,3}),
            new Code(new int[]{0,1,0,3}),
            new Code(new int[]{0,1,2,3})
        };
        CodeBreaker codeBreaker4 = new mockCodeBreaker(4, 4, guesses4);
        Game game4 = new Game(codeMaker, codeBreaker4, 4);
        game4.start();
        Assertions.assertTrue(game4.hasCodeBreakerWon());
        Assertions.assertFalse(game4.hasCodeBreakerLost());
        Assertions.assertTrue(game4.isGameOver());
    }

    @Test
    void testGame_that_you_lose_on_last_attempts(){
        Code secretCode = new Code(new int[]{0,1,2,3});
        CodeMaker codeMaker = new mockCodeMakerComputer(4, secretCode);

        // On last attempt
        Code[] guesses4 =  {
            new Code(new int[]{1,1,1,1}),
            new Code(new int[]{0,1,1,3}),
            new Code(new int[]{0,1,0,3}),
            new Code(new int[]{2,2,2,2})
        };
        CodeBreaker codeBreaker4 = new mockCodeBreaker(4, 4, guesses4);
        Game game4 = new Game(codeMaker, codeBreaker4, 4);
        game4.start();
        Assertions.assertFalse(game4.hasCodeBreakerWon());
        Assertions.assertTrue(game4.hasCodeBreakerLost());
        Assertions.assertTrue(game4.isGameOver());
    }
}
