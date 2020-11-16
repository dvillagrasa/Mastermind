import controllers.GameMaker;
import ui.Reader;

public class Main {
    
    public static void main(String[] args) {
        Reader reader = new Reader();
        Mastermind mastermind = new Mastermind(reader, new GameMaker(reader));
        mastermind.run();
    }
}