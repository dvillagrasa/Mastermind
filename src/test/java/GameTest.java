import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import controllers.CodeBreaker;
import controllers.CodeMaker;
import controllers.CodeMakerComputer;
import controllers.Game;
import ui.Reader;



public class GameTest {

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
}
