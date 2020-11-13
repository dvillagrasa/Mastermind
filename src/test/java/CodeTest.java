import Core.Code;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;



public class CodeTest {



  @Test
  public void testGetCode(){
    int[][] validCodes= {
            {1,2,3,4,5},
            {0},
            {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}
    };
    for (int[] validCode : validCodes){
      Code code = new Code(validCode);
      Assertions.assertArrayEquals(validCode,code.getCode());
    }

  }

  @Test
  public void testGetLength(){
    int[] codeReal={1,2,3,4,5};
    Code code = new Code(codeReal);
    Assertions.assertEquals(code.getLenght(),5);
  }

  @Test
  public void it_should_throw_RuntimeException_when_code_is_invalid() {
    //The code has a null array
    Assertions.assertThrows(RuntimeException.class,() -> new Code(null));

    //The code has a negative number
    int[] negativeColorArray = {8,-1};
    Assertions.assertThrows(RuntimeException.class,() -> new Code(negativeColorArray));

    //The code has a number greater than 127
    //int[] bigColorArray = {8,127}; //no me deja el IDE poner un 128 a un byte
    //Assertions.assertThrows(RuntimeException.class,() -> new Core.Code(bigColorArray));
  }

  @Disabled
  @Test
  public void it_should_throw_RuntimeException_when_code_has_no_number() {

    // TODO: Buscar la manera de detectar que no es un número
    //The code has a character
    int[][] charInColorArrays = {
            {'r'},
            {8,'a'},
            {'4',0},
            {'z'},
            {'.'},
            {' '},
            {'-'}
    };
    for (int[] charInColorArray : charInColorArrays)
      Assertions.assertThrows(RuntimeException.class,() -> new Code(charInColorArray));

  }

  @Test
  void testEqualCodes() {
    Code code1 = new Code(new int[]{1,2});
    Code code2 = new Code(new int[]{1,2});
    Assertions.assertEquals(code1, code2);
  }


}
