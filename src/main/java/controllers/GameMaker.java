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
        //TODO: asdf
        return null;
    }

    
    

}