package ui;

public class Printer {

    public static void print(String string) {
        System.out.print(string);
    }

    public static void println(String string) {
        System.out.println(string);
    }

    public static void printColorCollection(int numberOfColors) {
        for (int i = 0; i < numberOfColors; i++) {
            print(" "+i+" ");
        }
        println("");
        
    }
}
