import controllers.Game;
import controllers.GameMaker;
import ui.Menu;
import ui.Printer;
import ui.Reader;

public class Mastermind {

    Menu mainMenu = new Menu();
    Reader reader;
    GameMaker gameMaker;

    public Mastermind(Reader reader,GameMaker gameMaker) {
        this.reader = reader;
        this.gameMaker = gameMaker;
    }

    private void buildMenu() {
        mainMenu.addOption2Menu("New Game", this::newGame);
        mainMenu.addOption2Menu("Quit game", this::exitGame);
    }

    public void run(){
        Printer.println("MASTERMIND");
        buildMenu();
        displayMenu();
        selectOption();
    }

    public void displayMenu(){
        mainMenu.display();
    }
    private void newGame(){
        Game game = gameMaker.createGame();
        game.start();
    }

    public void selectOption() {
        int option = reader.readInt("Select option: ",0,mainMenu.getNumOfOptions()-1);
        mainMenu.selectOption(option);
    }

    public void exitGame() {
        Printer.println("BYE");
        System.exit(0);
    }
    
}
