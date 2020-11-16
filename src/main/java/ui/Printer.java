package ui;

import core.Board;
import core.Code;
import core.KeyPeg;
import core.Keys;

public class Printer {
    /*Escriu per pantalla (strings)*/
    public static void print(String string) {
        System.out.print(string);
    }

    public static void println(String string) {
        System.out.println(string);
    }
    /*Escriu per pantalla (integers)*/
    public static void print(int integer) {
        System.out.print(integer);
    }
    /*Escriu per pantalla (strings)*/
    public static void printColorCollection(int numberOfColors) {
        for (int i = 0; i < numberOfColors; i++) {
            print(" "+i+" ");
        }
        println("");        
    }
    /*Escriu per pantalla (strings)*/
    public static void printBoard(Board board) {
        println("");
        println("BOARD:");
        for (int i = 0; i < board.getAttempts().length; i++) {
            Code attempt = board.getAttempts()[i];
            if (attempt != null) {
                printCode(attempt);
            }
            Keys keys = board.getKeys()[i];
            if (keys != null) {
                printKeys(keys);
            }
            println("");
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

    public static void cleanScreen() {
        try
        {
            final String os = System.getProperty("os.name");
    
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  ¯\_(ツ)_/¯
        }
    }

}
