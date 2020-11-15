package controllers;

import core.Code;

public abstract class CodeMaker {
    int numberOfColors;
    int lengthCode;
       
    protected CodeMaker(int numberOfColors,int lengthCode) {
      this.numberOfColors=numberOfColors;
      this.lengthCode=lengthCode;
    }

    public abstract Code generateCode();

    public int getNumberOfColors() {
      return numberOfColors;
    }

    public int getLengthCode() {
      return lengthCode;
    }
    
}
