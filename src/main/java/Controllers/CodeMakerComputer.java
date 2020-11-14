package controllers;

import Utils.ArrayUtils;
import core.Code;

public class CodeMakerComputer extends CodeMaker{
  


  public CodeMakerComputer(int numberOfColors,int lengthCode) {
    super(numberOfColors, lengthCode);
  }

  @Override
  public Code generateCode() {
    return new Code(ArrayUtils.getRandomIntArray(super.numberOfColors, super.lengthCode)); 
  }



}
