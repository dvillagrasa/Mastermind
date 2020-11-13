package Core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyTest {
  KeyPeg[] keypeg1=new KeyPeg[1];
  @Test
  void testgetLength() {
    Assertions.assertEquals(1,keypeg1.length);
  }
}