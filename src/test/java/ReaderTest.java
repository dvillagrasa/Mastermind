import UI.Reader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ReaderTest {

  @Test
  void testreadInt() {
    Scanner scan = new Scanner(System.in);
    int input=scan.nextInt();
    Assertions.assertEquals(input, Reader.readInt());

  }


  @Test
  void testcheckNumColors() {
    assertTrue(Reader.checkNumColors(4));
    assertTrue(Reader.checkNumColors(26));
    assertFalse(Reader.checkNumColors(27));
    assertFalse(Reader.checkNumColors(-1));
  }

  @Test
  void testcheckCodeLength() {
    assertTrue(Reader.checkCodeLength(4));
    assertTrue(Reader.checkCodeLength(6));
    assertFalse(Reader.checkCodeLength(-1));
    assertFalse(Reader.checkCodeLength(7));
  }

  @Test
  void testcheckNumGuesses() {

  }
}