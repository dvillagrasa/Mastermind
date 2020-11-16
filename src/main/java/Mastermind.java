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
    /*Construeix el menú*/
    private void buildMenu() {
        mainMenu.addOption2Menu("New Game", this::newGame);
        mainMenu.addOption2Menu("Quit game", this::exitGame);
    }

    public void run(){
        buildMenu();
        while(true){
            ui.Printer.cleanScreen();
            Printer.println("MASTERMIND");
            displayMenu();
            selectOption();
            if(false) break;
        }        
    }
    /*Mostra el menu*/
    public void displayMenu(){
        mainMenu.display();
    }
    /*Crea un nou joc*/
    private void newGame(){
        Game game = gameMaker.createGame();
        game.start();
        displayGameOver(game);
        reader.pressAnyKey();
    }
    /*Mostra missatge de partida acabada (depenent de la causa mostra un o altre missatge)*/
    private void displayGameOver(Game game){
        if(game.hasCodeBreakerLost()) ui.Printer.println("CodeBreaker has LOST");
        if(game.hasCodeBreakerWon()) ui.Printer.println("CodeBreaker has WON");    
    }
    /*Llegeix la pregunta y respon seleccionant una opció*/
    public void selectOption() {
        int option = reader.readInt("Select option: ",0,mainMenu.getNumOfOptions()-1);
        mainMenu.selectOption(option);
    }

    public void exitGame() {
        Printer.println("BYE");
        System.exit(0);
    }
    
}
