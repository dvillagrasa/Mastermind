package Core;

public class Board {
    int numberGuesses;

    public Board(Code secretCode, int numberGuesses) {
        if(secretCode == null)  throw new RuntimeException();
        if(numberGuesses <= 0)  throw new RuntimeException();

        this.numberGuesses = numberGuesses;
    }

    public int getNumberGuesses() {
        return numberGuesses;
    }

}
