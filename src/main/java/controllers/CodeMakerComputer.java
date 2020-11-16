package controllers;

import Utils.ArrayUtils;
import core.Code;

public class CodeMakerComputer extends CodeMaker{
  


  public CodeMakerComputer(int numberOfColors,int lengthCode) {
    super(numberOfColors, lengthCode);
  }
  /*Crea un codi*/
  @Override
  public Code generateCode() {
    ui.Printer.println("");
    ui.Printer.println("Computer has generated the Secret Code");
    return new Code(ArrayUtils.getRandomIntArray(super.numberOfColors, super.lengthCode)); 
  }



}
