package controllers;

import core.Board;
import core.Code;

public class Game {

    private CodeBreaker codeBreaker;
    private CodeMaker codeMaker;
    private Board board;
    private int attempts;
    private boolean gameOver = false;
    private boolean codeBreakerHasWon = false;
    
    

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
        play();
    }

    private boolean therAreAttempts() {
        return board.getNumAttempts() > 0 ;
    } 

    private void play() {        
        while(!isGameOver()) {
            askForGuess();
        }        
    }

   
    private void askForGuess() {
        Code guess = codeBreaker.askForGuess();
        codeBreakerHasWon = board.isSecretCode(guess);
        codeBreaker.receiveKeys(board.sendGuess(guess));  
        displayBoard();
    }

    private void displayBoard() {
        ui.Printer.printBoard(board);
    }

    public int getAttempts() {
        return this.attempts;
    }

    public int getLengthCode() {
        return codeMaker.getLengthCode();
    }

    public int getNumOfColors() {
        return codeMaker.getNumberOfColors();
    }

    public boolean isGameOver() {
        return hasCodeBreakerLost() || hasCodeBreakerWon();
    }
   
    public boolean hasCodeBreakerWon() {
        return codeBreakerHasWon;
    }

    public boolean hasCodeBreakerLost() {
        return !therAreAttempts();
    }
    
}