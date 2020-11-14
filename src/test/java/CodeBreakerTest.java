import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.CodeBreaker;



public class CodeBreakerTest {
  int numCol;
  int lengthCode;
  @BeforeEach
  void setUp() {
    numCol=5;
    lengthCode=6;
  }
  @Test
  void testCodeBreaker(){
    CodeBreaker codeBreaker =new CodeBreaker(numCol,lengthCode);
    Assertions.assertEquals(5,codeBreaker.numOfColors);
    Assertions.assertEquals(6,codeBreaker.lengthCode);
    //Invalid new instances
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(0,8));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(-1,8));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(5,0));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(5,-1));
    Assertions.assertThrows(RuntimeException.class , () -> new CodeBreaker(-1,0));  
  }

}