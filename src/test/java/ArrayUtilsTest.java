import Utils.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ArrayUtilsTest {

    @Test
    public void getRandomIntArrayTest(){
       int numberOfColors = 2;
       int lengthCode = 5;
       int[] randomIntArray =  ArrayUtils.getRandomIntArray(numberOfColors,lengthCode);
       Assertions.assertEquals(randomIntArray.length,lengthCode);
       int[] randomIntArray2 = ArrayUtils.getRandomIntArray(numberOfColors,lengthCode);
       Assertions.assertNotEquals(randomIntArray, randomIntArray2);
    }

    @Test
    public void getFullArrayTest(){
        int content=-1;
        int length=5;
        int [] array={-1,-1,-1,-1,-1};
        Assertions.assertArrayEquals(array,ArrayUtils.getFullArray(content,length));
    }



}
