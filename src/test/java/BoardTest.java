import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import core.Board;
import core.Code;
import core.KeyPeg;
import core.Keys;


public class BoardTest {
    Code secretCode;

    @BeforeEach
    void setUp() {
      secretCode = new Code(new int[]{1, 2, 3, 4});
    }

    /*Test de Caixa Negra:
     * Particions equivalents (correcta inicialització)*/
    @Test
    void testBoard() {
        Board board = new Board(secretCode,  1);
        Assertions.assertTrue(true);
    }

    /*Test de Caixa Negra:
     * Particions equivalents(valors que donguin error)  */
    @Test
    void it_should_throw_RuntimeException_when_board_is_invalid() {
        Assertions.assertThrows(RuntimeException.class,() -> new Board(null, 1));
        Assertions.assertThrows(RuntimeException.class,() -> new Board(secretCode, 0));
        Assertions.assertThrows(RuntimeException.class,() -> new Board(secretCode,  -1));
        Assertions.assertThrows(RuntimeException.class,() -> new Board(secretCode,  2147483647+1));
    }

    /*Test de Caixa Blanca:
     * Decision Coverage (per la conjunt dels 3 tests seguents,
     * totes les decisions acabaràn prenent els valors true o false*/

    /*Test de Caixa Negra:
     * Particions equivalents(cas en que s'ha encertat color i posició = WIN) */
    @Test
    void testSendGuess_should_return_Keys_full_of_CorrectPosition_KeyPegs() {
        Code code = new Code(new int[]{1,2,3,4});
        Board board = new Board(code,1);
        Keys keys =new Keys(new KeyPeg[]{KeyPeg.CorrectPosition,KeyPeg.CorrectPosition,KeyPeg.CorrectPosition,KeyPeg.CorrectPosition});
        Assertions.assertEquals(keys, board.sendGuess(code));
    }
    /*Test de Caixa Negra:
     * Particions equivalents(cas en que s'ha encertat color però no posicio) */
    @Test
    void testSendGuess_should_return_Keys_full_of_ExistColor_KeyPegs(){
        Code code = new Code(new int[]{1,2,3,4});
        Code code2 = new Code(new int[]{2,1,4,3});
        Board board = new Board(code,1);
        Keys keys =new Keys(new KeyPeg[]{KeyPeg.ExistColor,KeyPeg.ExistColor,KeyPeg.ExistColor,KeyPeg.ExistColor});
        Assertions.assertEquals(keys, board.sendGuess(code2));
    }
    /*Test de Caixa Blanca:
     * Path Coverage (Pasa per els tots condicionals anteriors
     * fins que finalment al arribar al ultim condicional, es
     * cumpleix i entra)*/

    /*Test de Caixa Negra :
     * Particions equivalents(valides:Scas en que no s'ha encertat res)  */
    @Test
    void testSendGuess_should_return_Keys_full_of_DoesNotExistColor_KeyPegs(){
        Code code = new Code(new int[]{1,2,3,4});
        Code code2 = new Code(new int[]{0,5,6,0});
        Board board = new Board(code,1);
        Keys keys =new Keys(new KeyPeg[]{KeyPeg.DoesNotExistColor,KeyPeg.DoesNotExistColor,KeyPeg.DoesNotExistColor,KeyPeg.DoesNotExistColor});
        Assertions.assertEquals(keys, board.sendGuess(code2));
    }
    /*Test de Caixa Negra :
     * Particions equivalents(valides)  */
    @Test
    void testGetNumberOpportunities(){
        Board board = new Board(secretCode,  1);
        Assertions.assertNotEquals(3,board.getOpportunities());
        Assertions.assertEquals(1,board.getOpportunities());
    }

}

