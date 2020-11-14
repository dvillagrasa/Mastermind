package controllers;

import core.Code;

public class CodeMaker {
    int numberOfColors;
    int lengthCode;
       
    public CodeMaker(int numberOfColors,int lengthCode) {
      this.numberOfColors=numberOfColors;
      this.lengthCode=lengthCode;
    }

    public Code generateCode() {
        return new Code(new int[]{0,0,0,0}); 
    }
    
}
