package ui;

import core.Board;
import core.Code;
import core.KeyPeg;
import core.Keys;

public class Printer {

    public static void print(String string) {
        System.out.print(string);
    }

    public static void println(String string) {
        System.out.println(string);
    }

    public static void print(int integer) {
        System.out.print(integer);
    }

    public static void printColorCollection(int numberOfColors) {
        for (int i = 0; i < numberOfColors; i++) {
            print(" "+i+" ");
        }
        println("");        
    }

    public static void printBoard(Board board) {
        println("BOARD:");
        for (int i = 0; i < board.getNumAttempts(); i++) {
            Code attempt = board.getAttempts()[i];
            if (attempt != null) {
                printCode(attempt);
            }
            Keys keys = board.getKeys()[i];
            if (keys != null) {
                printKeys(keys);
            }
            
        }
    }

    private static void printCode(Code code) {
        print("| ");
        for (int color : code.getCode()) {
            print(color);
            print(" | ");
        }        
    }

    private static void printKeys(Keys keys) {
        print("| ");
        for (KeyPeg keyPeg : keys.getKeys()) {
            printKeyPeg(keyPeg);
            print(" | ");
        }        
    }

    private static void printKeyPeg(KeyPeg keyPeg) {
        String character = "%";
        if(keyPeg == KeyPeg.CorrectPosition)
            //character = "\u2713"; //✓
            character = "\u25CF"; // ●
        if(keyPeg == KeyPeg.ExistColor)
            character = "\u25CB"; //○
        if(keyPeg == KeyPeg.DoesNotExistColor)
            character = " "; 
        print(character);
    }

}
