import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Core.KeyPeg;
import Core.Keys;
class KeysTest {

  @Test
  void testgetLength() {
    Keys keys =new Keys(new KeyPeg[]{KeyPeg.ExistColor});
    Keys keys2 =new Keys(new KeyPeg[]{KeyPeg.ExistColor,KeyPeg.DoesNotExistColor});
    Keys keys3 =new Keys(new KeyPeg[]{KeyPeg.ExistColor,KeyPeg.CorrectPosition,KeyPeg.DoesNotExistColor});
    Assertions.assertEquals(1,keys.getLength());
    Assertions.assertEquals(2,keys2.getLength());
    Assertions.assertEquals(3,keys3.getLength());
  }

  @Test
  public void it_should_throw_RuntimeException_when_key_length_is_0(){
    Assertions.assertThrows(RuntimeException.class, ()-> new Keys(new KeyPeg[]{}));
  }

  @Test
  public void it_should_throw_RuntimeException_when_key_length_is_null(){
    Assertions.assertThrows(RuntimeException.class, ()-> new Keys(null));
  }
}