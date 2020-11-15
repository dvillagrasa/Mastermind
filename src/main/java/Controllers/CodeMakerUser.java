package controllers;

import core.Code;
import ui.Reader;

public class CodeMakerUser extends CodeMaker {
    
    private Reader reader;

    public CodeMakerUser(int numberOfColors, int lengthCode,Reader reader) {
        super(numberOfColors, lengthCode);
        this.reader = reader;
    }

    @Override
    public Code generateCode() {
        // TODO Auto-generated method stub
        return null;
    }

   
    
}
