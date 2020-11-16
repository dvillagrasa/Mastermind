package controllers;

import core.Code;
import ui.Reader;

public class CodeMakerUser extends CodeMaker {
    
    private Reader reader;

    public CodeMakerUser(int numberOfColors, int lengthCode,Reader reader) {
        super(numberOfColors, lengthCode);
        this.reader = reader;
    }
    /*Crea un codi*/
    @Override
    public Code generateCode() {
        return new Code(askForArrayOfColors(numberOfColors, lengthCode));
    }


    private int[] askForArrayOfColors(int numberOfColors, int lengthCode) {
        ui.Printer.println("");
        ui.Printer.println("CODE CREATOR");
        ui.Printer.print("Available colours:");
        ui.Printer.printColorCollection(numberOfColors);
        int[] colorArray = new int[lengthCode];
        for (int i = 0; i < colorArray.length; i++) {
            String question = "Write number of color of position " + (i+1) + " of Code";
            int color = reader.readInt(question,0,numberOfColors-1);
            colorArray[i] = color;
        }
        return colorArray;
    }
   
    
}
