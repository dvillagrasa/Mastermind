import UI.Menu;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class MenuTest {

    private Menu menu = new Menu();

    private void buildMenu() {
        menu.addOption2Menu("Option 1", this::dummyMethod);
        menu.addOption2Menu("Option 2", this::dummyMethod);
        menu.addOption2Menu("Option 3", this::dummyMethod);
    }

    private void dummyMethod() {

    }

    @Test
    public void selectOption() {
        buildMenu();
        Assertions.assertTrue(menu.selectOption(0));
        Assertions.assertTrue(menu.selectOption(1));
        Assertions.assertTrue(menu.selectOption(2));
    }

    @Test
    public void it_should_return_false_when_option_is_invalid() {
        Assertions.assertFalse(menu.selectOption(-1));
        Assertions.assertFalse(menu.selectOption(4));
        Assertions.assertFalse(menu.selectOption(5));
    }



    private void displayMenu() {
        menu.display();
    }
}
