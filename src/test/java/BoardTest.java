import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Core.Board;
import Core.Code;



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
}
