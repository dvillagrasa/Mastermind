import org.junit.jupiter.api.Test;

import controllers.CodeMakerComputer;
import core.Code;

import org.junit.jupiter.api.Assertions;


class CodeMakerComputerTest {

  @Test
  public void testGenerateCode() {
      CodeMakerComputer codeMaker = new CodeMakerComputer(2,5);
      Code code1 = codeMaker.generateCode();
      Code code2 = codeMaker.generateCode();
      Assertions.assertNotEquals(code1, code2);
  }
}