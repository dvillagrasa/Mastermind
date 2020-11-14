package controllers;

import java.lang.ProcessBuilder.Redirect;

import core.Code;
import ui.Reader;

public class CodeBreaker {
  private int numOfColors;
  private int lengthCode;

  private Reader reader;
  
  public CodeBreaker(int numOfColors, int lengthCode, Reader reader) {
    if(numOfColors <= 0)  throw new RuntimeException();
    if(lengthCode <= 0)  throw new RuntimeException();
    if(reader == null) throw new RuntimeException();
    this.numOfColors = numOfColors;
    this.lengthCode = lengthCode;
  }

  public Code askForGuessAGuess() {
    return null;
  }

  public int getNumOfColors() {
    return numOfColors;
  }

  public int getLengthCode() {
    return lengthCode;
  }

}
