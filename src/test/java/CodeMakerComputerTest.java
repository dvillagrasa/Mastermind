import org.junit.jupiter.api.Test;

import controllers.CodeMakerComputer;
import core.Code;

import org.junit.jupiter.api.Assertions;


class CodeMakerComputerTest {

  /*Test de Caixa Negra:
   * Particions equivalents(valides)*/
  @Test
  public void testGenerateCode() {
      CodeMakerComputer codeMaker = new CodeMakerComputer(8,8);
      Code code1 = codeMaker.generateCode();
      Code code2 = codeMaker.generateCode();
      Assertions.assertNotEquals(code1, code2);
  }
}