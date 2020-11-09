package Core;

public class Board {
    byte numberGuesses;

    public Board(Code secretCode, byte numberGuesses) {
        if(secretCode == null)  throw new RuntimeException();
        if(numberGuesses <= 0)  throw new RuntimeException();
        this.numberGuesses = numberGuesses;
    }

    public byte getNumberGuesses() {
        return numberGuesses;
    }
}
