package Core;

public class Board {
    private int opportunities;
    private Code secretCode;
    
    public Board(Code secretCode, int opportunities) {
        if(secretCode == null)  throw new RuntimeException();
        if(opportunities <= 0)  throw new RuntimeException();

        this.opportunities = opportunities;
        this.secretCode = secretCode;
    }

    public int getOpportunities() {
        return opportunities;
    }


    public Keys sendGuess(Code guess) {
        KeyPeg[] keyPegArray = new KeyPeg[guess.getLenght()];
        for (int i = 0; i < keyPegArray.length; i++) {
            if(secretCode.correctPosition(guess.getCode()[i],i)){
                keyPegArray[i]=KeyPeg.CorrectPosition;
            }else if(secretCode.existColor(guess.getCode()[i])){
                keyPegArray[i]=KeyPeg.ExistColor;
            }else keyPegArray[i]=KeyPeg.DoesNotExistColor;
        }
        return new Keys(keyPegArray);
    }



}
