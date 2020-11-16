package mocks;

import controllers.CodeBreaker;
import core.Code;
import ui.Reader;

public class mockCodeBreaker extends CodeBreaker {

    Code[] guesses;

    public mockCodeBreaker(int numOfColors, int lengthCode, Reader reader,Code[] guesses) {
        super(numOfColors, lengthCode, reader);
        this.guesses = guesses;
    }

    @Override
    public Code askForGuess() {
        // TODO Auto-generated method stub
        return super.askForGuess();
    }
    
}
