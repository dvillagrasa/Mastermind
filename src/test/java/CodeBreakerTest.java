import Core.CodeBreaker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



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
    CodeBreaker code =new CodeBreaker(numCol,lengthCode);
    Assertions.assertEquals(5,code.numOfColors);
    Assertions.assertEquals(6,code.lengthCode);
  }

}