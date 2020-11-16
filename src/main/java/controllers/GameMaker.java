package controllers;

import ui.Reader;

public class GameMaker {
    
    private Reader reader;
    private int minPosibleColors = 4;
    private int maxPosibleColors = 9;
    private int minCodeLength = 4;
    private int maxCodeLength = 9;
    private int minAttempts = 4;
    private int maxAttempts = 9;


    public GameMaker(Reader reader) {
        this.reader = reader;
    }   

    /*
    It is a method that asks the user for the parameters that will configure the new game.
    */
    public Game createGame() {
        String questionNumColors = String.format("Number of possible colors [%d..%d]:", minPosibleColors, maxPosibleColors);
        int numOfColors = this.reader.readInt(questionNumColors, minPosibleColors, maxPosibleColors);

        String questionCodeLenght = String.format("Length of secret code [%d..%d]:", minCodeLength, maxCodeLength);
        int codeLength = this.reader.readInt(questionCodeLenght, minCodeLength, maxCodeLength);

        String questionAttempts = String.format("Number of attempts to guess the secret code [%d..%d]:", minAttempts, maxAttempts);
        int attempts = this.reader.readInt(questionAttempts, minAttempts, maxAttempts);

        CodeBreaker codeBreaker = new CodeBreaker(numOfColors, codeLength, reader);
        CodeMaker codeMaker;
        
        if (reader.readBool("Do you want the CodeMaker to be the computer?[y/n]", 'y', 'n')) {
            codeMaker  = new CodeMakerComputer(numOfColors, codeLength);
        } else {
            codeMaker  = new CodeMakerUser(numOfColors, codeLength, reader);  
        }         
        return new Game(codeMaker, codeBreaker, attempts);
    }

    
    

}