import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ui.Reader;

public class ReaderTest {

    /*Test de Caixa Blanca:
     * Condition Coverage: provem totes les condicions*/
    @Test
    void testConditionIsInside(){
        Reader reader = new Reader();
        // false false Impossible

        // true false
        Assertions.assertFalse(reader.isInside(6, 0, 5));

        // false true
         Assertions.assertFalse(reader.isInside(-1, 0, 5));

         //true true
         Assertions.assertTrue(reader.isInside(3, 0, 5));

    }
}
