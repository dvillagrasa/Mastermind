import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import core.Code;



public class CodeTest {


  /*Test de Caixa Negra:
   * Particions equivalents(valides) i valors limit */
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
  /*Test de Caixa Negra:
   * Particions equivalents(valides) i valors limit */
  @Test
  public void testGetLength(){
    int[][] validCodes= {
        {1,2,3,4,5},
        {0},
        {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}
    };
    for (int[] validCode : validCodes){
      Code code = new Code(validCode);
      Assertions.assertEquals(validCode,code.getCode());
    }

  }

  @Test
    public void it_should_throw_RuntimeException_when_code_length_is_invalid(){
    int[] codeReal={};
    Assertions.assertThrows(RuntimeException.class,() -> new Code(codeReal));
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

  @Disabled // TODO: Buscar la manera de detectar que no es un número
  @Test
  public void it_should_throw_RuntimeException_when_code_has_no_number() {

    
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
    Assertions.assertNotEquals(null,code1);
    Assertions.assertEquals(code1,code1);
    Code code1b = code1;
    Assertions.assertEquals(code1,code1b);

    
    Code code2 = new Code(new int[]{1,2});

    Assertions.assertEquals(code1, code2);  
    
    Code code3 = new Code(new int[]{1,1});
    Assertions.assertNotEquals(code1, code3);  
  }

  @Test
  void testExistColor(){
    int[] colors = new int[]{1,1,2,4};
    int[] doesntExistColors = new int[]{0,5,0,3};
    Code code= new Code(colors);
    for (int color : colors) {
      Assertions.assertTrue(code.existColor(color));
    }

    for (int color : doesntExistColors) {
      Assertions.assertFalse(code.existColor(color));
    }
  }

  @Test
  void testCorrectPosition(){
    int[] colors = new int[]{1,1,2,4};
    Code code= new Code(colors);
    for (int i = 0; i < code.getLenght(); i++) {
      Assertions.assertTrue(code.correctPosition(colors[i],i));
    }
    int[] colors2=new int[]{0,3,5,6};
    for (int i = 0; i < code.getLenght(); i++) {
      Assertions.assertFalse(code.correctPosition(colors2[i],i));
    }
  }

}
