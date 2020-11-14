import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Core.Board;
import Core.Code;
import Core.KeyPeg;
import Core.Keys;


public class BoardTest {
    Code secretCode;

    @BeforeEach
    void setUp() {
      secretCode = new Code(new int[]{1, 2, 3, 4});
    }

    @Test
    void testBoard() {
        Board board = new Board(secretCode,  1);
        Assertions.assertTrue(true);
    }

    @Test
    void it_should_throw_RuntimeException_when_board_is_invalid() {
        Assertions.assertThrows(RuntimeException.class,() -> new Board(null, 1));
        Assertions.assertThrows(RuntimeException.class,() -> new Board(secretCode, 0));
        Assertions.assertThrows(RuntimeException.class,() -> new Board(secretCode,  -1));
        Assertions.assertThrows(RuntimeException.class,() -> new Board(secretCode,  2147483647+1));
    }

    @Test
    void testSendGuess_should_return_Keys_full_of_CorrectPosition_KeyPegs() {
        Code code = new Code(new int[]{1,2,3,4});
        Board board = new Board(code,1);
        Keys keys =new Keys(new KeyPeg[]{KeyPeg.CorrectPosition,KeyPeg.CorrectPosition,KeyPeg.CorrectPosition,KeyPeg.CorrectPosition});
        Assertions.assertEquals(keys, board.sendGuess(code));
    }

    @Test
    void testGetNumberGuesses(){
        Board board = new Board(secretCode,  1);
        Assertions.assertNotEquals(3,board.getNumberGuesses());
        Assertions.assertEquals(1,board.getNumberGuesses());
    }

}

