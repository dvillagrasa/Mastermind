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
    boolean cert=false;
    assertTrue(Reader.checkNumColors(4));
    assertTrue(Reader.checkNumColors(26));
    assertFalse(Reader.checkNumColors(27));
    assertFalse(Reader.checkNumColors(-1));
  }

  @Test
  void testcheckCodeLength() {

  }

  @Test
  void testcheckNumGuesses() {

  }
}