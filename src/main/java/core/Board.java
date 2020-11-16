package core;

public class Board {
    private int numAttempts;
    private Code secretCode;
    private Code[] attempts;
    private Keys[] keys;
    
    public Board(Code secretCode, int numAttempts) {
        if(secretCode == null)  throw new RuntimeException();
        if(numAttempts <= 0)  throw new RuntimeException();

        this.numAttempts = numAttempts;
        this.secretCode = secretCode;

        attempts = new Code[numAttempts];
        keys = new Keys[numAttempts];
    }

    public int getNumAttempts() {
        return numAttempts;
    }


    public Keys sendGuess(Code guess) {
        if(numAttempts == 0) throw new RuntimeException();

        int actualPosition = keys.length - numAttempts;
        
        attempts[actualPosition] = guess;

        KeyPeg[] keyPegArray = new KeyPeg[guess.getLenght()];
        for (int i = 0; i < keyPegArray.length; i++) {
            if(secretCode.correctPosition(guess.getCode()[i],i)){
                keyPegArray[i]=KeyPeg.CorrectPosition;
            }else if(secretCode.existColor(guess.getCode()[i])){
                keyPegArray[i]=KeyPeg.ExistColor;
            }else keyPegArray[i]=KeyPeg.DoesNotExistColor;
        }
        Keys generatedKeys = new Keys(keyPegArray);
        this.keys[actualPosition] = generatedKeys;
        numAttempts--;
        return generatedKeys;
    }

    public boolean isSecretCode(Code guess) {
        return this.secretCode == guess;
    }

    public Code[] getAttempts() {
        return attempts;
    }

    public Keys[] getKeys() {
        return keys;
    }

  



}
