
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import controllers.CodeBreaker;
import core.KeyPeg;
import core.Keys;
import ui.Reader;



public class CodeBreakerTest {

  Reader reader;

  @BeforeEach
  void setUp() {  
    reader = new Reader();
  }

  /*Test de Caixa Negra:
   * Particions equivalents(valides) i
   * valors limit i frontera*/
  @Test
  void testCodeBreaker(){
    //Valid new instances
    CodeBreaker codeBreaker =new CodeBreaker(5,6,reader);
    CodeBreaker codeBreaker2 =new CodeBreaker(1,1,reader);
    Assertions.assertEquals(5,codeBreaker.getNumOfColors());
    Assertions.assertEquals(6,codeBreaker.getLengthCode());

    Assertions.assertEquals(1,codeBreaker2.getNumOfColors());
    Assertions.assertEquals(1,codeBreaker2.getLengthCode());



  }

  /*Test de Caixa Negra:
   * Particions equivalents(invalides)*/
  @Test
  public void it_should_throw_RuntimeException_when_codeBreaker_is_invalid(){
    //Invalid new instances
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(0,8,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(-1,8,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(5,0,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(5,-1,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(-1,0,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(8,8,null));
  }

  @Test
  void testReceiveKeys() {
    CodeBreaker codeBreaker = new CodeBreaker(4,4,reader);
    Keys invalidKeys = new Keys(new KeyPeg[]{KeyPeg.CorrectPosition});
    Assertions.assertThrows(RuntimeException.class , () -> codeBreaker.receiveKeys(invalidKeys));
  }

 
}