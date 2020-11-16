package mocks;

import controllers.CodeMakerComputer;
import core.Code;

public class mockCodeMakerComputer extends CodeMakerComputer {

    Code code;
    public mockCodeMakerComputer(int numberOfColors,Code code) {
        super(numberOfColors, code.getLenght());
        this.code = code;
    }
    
    @Override
    public Code generateCode() {
        return this.code;
    }

   
    
}
