import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class CodeTest {



  @Test
  public void testGetCode(){
    byte[] codeReal={1,2,3,4,5};
    Code code = null;
    code = new Code(codeReal);
    Assertions.assertArrayEquals(codeReal,code.getCode());
  }

  @Test
  public void testGetLength(){
    byte[] codeReal={1,2,3,4,5};
    Code code = null;
    code = new Code(codeReal);
    Assertions.assertEquals(code.getLenght(),5);
  }

  @Test
  public void it_should_throw_RuntimeException_when_code_is_invalid() {
    Assertions.assertThrows(RuntimeException.class,() -> new Code(null));
  }


}
