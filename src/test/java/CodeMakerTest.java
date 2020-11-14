import org.junit.jupiter.api.Test;

import Core.Code;
import Core.CodeMaker;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

class CodeMakerTest {

  @Test
  public void testGenerateCode() {
      CodeMaker codeMaker = new CodeMaker(1,5);
      Code code1 = codeMaker.generateCode();
      Code code2 = codeMaker.generateCode();
      Assertions.assertNotEquals(code1, code2);
  }
}