import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import Core.Code;
import Core.CodeMaker;


class CodeMakerTest {

  @Test
  public void testGenerateCode() {
      CodeMaker codeMaker = new CodeMaker(2,5);
      Code code1 = codeMaker.generateCode();
      Code code2 = codeMaker.generateCode();
      Assertions.assertNotEquals(code1, code2);
  }
}