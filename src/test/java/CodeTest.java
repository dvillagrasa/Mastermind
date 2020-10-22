import org.junit.Assert;
import org.junit.Test;


public class CodeTest {
  Code code=new Code(new byte[]{1,2,3,4,5});
  @Test
  public void testGetCode(){
    byte[] codeReal={1,2,3,4,5};
    Assert.assertArrayEquals(codeReal,code.getCode());
  }
  @Test
  public void testGetLength(){
    Assert.assertEquals(code.getLenght(),5);
  }

}
