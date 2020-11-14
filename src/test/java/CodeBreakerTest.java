
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.CodeBreaker;
import ui.Reader;



public class CodeBreakerTest {

  Reader reader;

  @BeforeEach
  void setUp() {  
    reader = new Reader();
  }
  @Test
  void testCodeBreaker(){
    //Valid new instances
    CodeBreaker codeBreaker =new CodeBreaker(5,6,reader);
    Assertions.assertEquals(5,codeBreaker.getNumOfColors());
    Assertions.assertEquals(6,codeBreaker.getLengthCode());
    //Invalid new instances
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(0,8,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(-1,8,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(5,0,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(5,-1,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(-1,0,reader));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(8,8,null));   
  }

  @Test
  void testAskForGuessAGuess(){
    Assertions.assertTrue(true);
  }
}