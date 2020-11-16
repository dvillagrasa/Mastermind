package controllers;

import core.Code;
import core.Keys;
import ui.Reader;


public class CodeBreaker {
  private int numOfColors;
  private int lengthCode;

  private Reader reader;

  public CodeBreaker(int numOfColors, int lengthCode, Reader reader) {
    if (numOfColors <= 0)
      throw new RuntimeException();
    if (lengthCode <= 0)
      throw new RuntimeException();
    if (reader == null)
      throw new RuntimeException();
    this.numOfColors = numOfColors;
    this.lengthCode = lengthCode;
    this.reader = reader;
  }

  /*Retorna un codi */
  public Code askForGuess() {
    ui.Printer.println("");
    ui.Printer.println("Create a Secret Code guess with Code Creator:");
    CodeMakerUser codeMaker = new CodeMakerUser(numOfColors,lengthCode,reader);
    return codeMaker.generateCode();
  }

  public void receiveKeys(Keys keys){
   if (keys.getLength() != this.lengthCode) throw new RuntimeException();
    // Method for an Artificial Intelligence to overwrite it.
  }
  /*Retorna el nombre de colors*/
  public int getNumOfColors() {
    return numOfColors;
  }
  /*Retorna la longitud del codi*/
  public int getLengthCode() {
    return lengthCode;
  }

}
