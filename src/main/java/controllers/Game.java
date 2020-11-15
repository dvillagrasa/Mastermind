package controllers;

import core.Board;

public class Game {

    private CodeBreaker codeBreaker;
    private CodeMaker codeMaker;
    private Board board;
    private int attempts;

    public Game(CodeMaker codeMaker, CodeBreaker codeBreaker,int attempts) {
        if(codeMaker.getLengthCode() != codeBreaker.getLengthCode()) throw new RuntimeException();
        if(codeMaker.getNumberOfColors() != codeBreaker.getNumOfColors()) throw new RuntimeException();
        if(attempts <= 0) throw new RuntimeException();
        this.codeMaker = codeMaker;
        this.codeBreaker = codeBreaker;
        this.attempts = attempts;
    }

    public void start() {
        board = new Board(codeMaker.generateCode(), this.attempts);
    }

    public int getAttempts() {
        return this.attempts;
    }

    
   

    
}