import Utils.Random;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomTest {

  @Test
  void nextInt() {
    Random random=new Random();
    int num1=random.nextInt(5);
    int num2=random.nextInt(5);
    assertNotEquals(num1,num2);

  }
}