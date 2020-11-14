package Core;

public class Board {
    private int numberGuesses;
    private Code secretCode;

    public Board(Code secretCode, int numberGuesses) {
        if(secretCode == null)  throw new RuntimeException();
        if(numberGuesses <= 0)  throw new RuntimeException();

        this.numberGuesses = numberGuesses;
        this.secretCode = secretCode;
    }

    public int getNumberGuesses() {
        return numberGuesses;
    }

    public Keys sendGuess(Code guess) {
        return new Keys(new KeyPeg[]{KeyPeg.ExistColor});
    }

}
