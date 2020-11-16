package core;

public class Board {
    private int numAttempts;
    private Code secretCode;
    private Code[] attempts;
    private Keys[] keys;
    private int maxAttempts;
    
    public Board(Code secretCode, int numAttempts) {
        if(secretCode == null)  throw new RuntimeException();
        if(numAttempts <= 0)  throw new RuntimeException();

        this.numAttempts = numAttempts;
        maxAttempts = numAttempts;
        this.secretCode = secretCode;

        attempts = new Code[numAttempts];
        keys = new Keys[numAttempts];
        
    }
    /*Retorna el nombre d'oportunitats*/
    public int getNumAttempts() {
        return numAttempts;
    }

    /*Rep una suposició de codi secret i retorna les claus de pistes */
    public Keys sendGuess(Code guess) {
        if(numAttempts == 0) throw new RuntimeException();

        int actualPosition = maxAttempts - numAttempts;
        
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
    /*Retorna si el codi rebut per parametre es secret*/
    public boolean isSecretCode(Code guess) {
        return this.secretCode.equals(guess);
    }
    /*Retorna les oportunitats*/
    public Code[] getAttempts() {
        return attempts;
    }
    /*Retorna les claus*/
    public Keys[] getKeys() {
        return keys;
    }

  



}
