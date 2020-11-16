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
    /*Retorna el nombre de colors*/
    public int getNumberOfColors() {
      return numberOfColors;
    }
    /*Retorna la longitud del codi*/
    public int getLengthCode() {
      return lengthCode;
    }
    
}
