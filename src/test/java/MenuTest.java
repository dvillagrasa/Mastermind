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
        menu.selectOption(0);
        menu.selectOption(1);
        menu.selectOption(2);
        Assertions.assertTrue(true);
    }



    private void displayMenu() {
        menu.display();
    }
}
