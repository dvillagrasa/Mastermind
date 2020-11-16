package mocks;

import controllers.CodeBreaker;
import core.Code;
import ui.Reader;

public class mockCodeBreaker extends CodeBreaker {

    Code[] guesses;
    int nextGuess = 0;

    public mockCodeBreaker(int numOfColors, int lengthCode,Code[] guesses) {
        super(numOfColors, lengthCode, new Reader());
        this.guesses = guesses;
    }

    @Override
    public Code askForGuess() {
        Code guess = guesses[nextGuess];
        nextGuess++;
        return guess;
    }
    
}
