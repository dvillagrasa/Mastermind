package controllers;

import Utils.ArrayUtils;
import core.Code;

public class CodeMaker {
  int numberOfColors;
  int lengthCode;
  public CodeMaker(int numberOfColors,int lengthCode) {
    this.numberOfColors=numberOfColors;
    this.lengthCode=lengthCode;
  }

  public Code generateCode() {
    return new Code(ArrayUtils.getRandomIntArray(numberOfColors, lengthCode)); 
  }



}
