import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import controllers.CodeMakerUser;
import core.Code;
import mocks.MockReader;

public class CodeMakerUserTest {
    
    
    @Test
    void testGenerateCode() {
        int[] colorArray = new int[]{0,1,2,3};
        CodeMakerUser codeMaker = new CodeMakerUser(5,4,new MockReader(colorArray)); 
        Code actual = codeMaker.generateCode();  
        Assertions.assertEquals(new Code(colorArray), actual);
    }
}
