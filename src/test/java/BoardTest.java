

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
    void testGetNumberAttempts(){
        Board board = new Board(secretCode,  1);
        Assertions.assertNotEquals(3,board.getNumAttempts());
        Assertions.assertEquals(1,board.getNumAttempts());
    }

    /*
    Test de Caixa Negra :
     * Cas d'us(invalid): No es pot enviar un Guess si ja no hi ha Attempts. 
    */
    @Test
    void testSendGuess_should_throw_RuntimeException_when_there_are_not_attempts() {
        Board board = new Board(secretCode,1);
        Code guess = new Code(new int[]{1,1,1,1});
        board.sendGuess(guess);
        Assertions.assertThrows(RuntimeException.class, () -> board.sendGuess(guess));
    }

    /*Test de Caixa Negra :
     * Particions equivalents */
    @Test
    void testIsSecretCode() {
        int[] colorsArray = new int[]{5,5,5,5};
        Code code1 = new Code(colorsArray);
        Code code2 = new Code(new int[]{5,4,5,5});
        Board board = new Board(code1,1);
        Assertions.assertTrue(board.isSecretCode(code1));
        Assertions.assertFalse(board.isSecretCode(code2));
        Assertions.assertTrue(board.isSecretCode(new Code(colorsArray)));
    }
    /*Test de Caixa Negra :
     * Pairwise testing i Path Coverage (implicit)*/
    @Test
    void testPairwiseTesting_sendGuess() {
        Board board = new Board(new Code(new int[]{0,1,2}),11);
        
        //1  x x ●
        Keys key1 = new Keys(new KeyPeg[]{KeyPeg.DoesNotExistColor,KeyPeg.DoesNotExistColor,KeyPeg.CorrectPosition});
        Assertions.assertEquals(key1, board.sendGuess(new Code(new int[]{3,3,2})));

        //2  x ● x
        Keys key2 = new Keys(new KeyPeg[]{KeyPeg.DoesNotExistColor,KeyPeg.CorrectPosition,KeyPeg.DoesNotExistColor});
        Assertions.assertEquals(key2, board.sendGuess(new Code(new int[]{3,1,3})));

        //3  x ○ ○
        Keys key3 = new Keys(new KeyPeg[]{KeyPeg.DoesNotExistColor,KeyPeg.ExistColor,KeyPeg.ExistColor});
        Assertions.assertEquals(key3, board.sendGuess(new Code(new int[]{3,0,0})));

        //4  ○ x ○
        Keys key4 = new Keys(new KeyPeg[]{KeyPeg.ExistColor,KeyPeg.DoesNotExistColor,KeyPeg.ExistColor});
        Assertions.assertEquals(key4, board.sendGuess(new Code(new int[]{1,3,1})));
        //5  ○ ● ●
        Keys key5 = new Keys(new KeyPeg[]{KeyPeg.ExistColor,KeyPeg.CorrectPosition,KeyPeg.CorrectPosition});
        Assertions.assertEquals(key5, board.sendGuess(new Code(new int[]{2,1,2})));

        //6  ○ ○ x
        Keys key6 = new Keys(new KeyPeg[]{KeyPeg.ExistColor,KeyPeg.ExistColor,KeyPeg.DoesNotExistColor});
        Assertions.assertEquals(key6, board.sendGuess(new Code(new int[]{2,2,3})));

        //7  ● x x
        Keys key7 = new Keys(new KeyPeg[]{KeyPeg.CorrectPosition,KeyPeg.DoesNotExistColor,KeyPeg.DoesNotExistColor});
        Assertions.assertEquals(key7, board.sendGuess(new Code(new int[]{0,3,3})));

        //8  ● ● ○
        Keys key8 = new Keys(new KeyPeg[]{KeyPeg.CorrectPosition,KeyPeg.CorrectPosition,KeyPeg.ExistColor});
        Assertions.assertEquals(key8, board.sendGuess(new Code(new int[]{0,1,1})));

        //9  ● ○ ●
        Keys key9 = new Keys(new KeyPeg[]{KeyPeg.CorrectPosition,KeyPeg.ExistColor,KeyPeg.CorrectPosition});
        Assertions.assertEquals(key9, board.sendGuess(new Code(new int[]{0,0,2})));

    }
}

