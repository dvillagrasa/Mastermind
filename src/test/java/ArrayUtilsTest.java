import Utils.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArrayUtilsTest {

    @Test
    public void getRandomIntArrayTest(){
       byte numberOfColors = 2;
       byte lengthCode = 5;
       byte[] randomByteArray =  ArrayUtils.getRandomByteArray(numberOfColors,lengthCode);
       byte[] randomByteArray2 = ArrayUtils.getRandomByteArray(numberOfColors,lengthCode);
       Assertions.assertNotEquals(Arrays.toString(randomByteArray), Arrays.toString(randomByteArray2));
    }


}
