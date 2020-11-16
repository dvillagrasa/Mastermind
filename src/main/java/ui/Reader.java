package ui;
import java.util.Scanner;
public class Reader {

  /*Llegeix un integer (fa de façana)*/
  public int readInt() {
    Scanner scan = new Scanner(System.in);
    int input;
    input = scan.nextInt();
    //scan.close();
    return input;
  }

  /*Fa una pregunta, i si no es un integer (lo introduit), repeteix la pregunta*/
  public int readInt(String question) {
    int input=-1;
    boolean correct = false;
    do {
      Printer.println(question);
      try {
        input = readInt();
        correct = true;

      } catch (Exception e) {
        Printer.println("Invalid number");
      }
    } while(!correct);
    return input;
  }
  /*Fa una pregunta, i si no es un integer (lo introduit) entre un maxim i un minim, repeteix la pregunta*/
  public int readInt(String question,int min, int max) {
    boolean correct = false;
    int input;
    do {
      input =  readInt(question);
      correct = input >= min && input <= max;
    } while(!correct);
    return input;
  }
  /*Llegeix un caracter*/
  public char readChar() {
    Scanner scan = new Scanner(System.in);
    char input;
    input = scan.next().charAt(0);
    //scan.close();
    return input;
  }
  /*Fa una pregunta i llegeix un caracter*/
  public char readChar(String question) {
    char input= ' ';
    boolean correct = false;
    do {
      Printer.println(question);
      try {
        input = readChar();
        correct = true;

      } catch (Exception e) {
        Printer.println("Invalid chararacter ");
      }
    } while(!correct);
    return input;
  }
  /*Llegeix un booleà */
  public boolean readBool(String question,char yes,char no) {
    char input;
    boolean isYes = false;
    boolean correct = false;
    do {
      input = readChar(question);
      correct = input == no;
      if (input == yes) {
        correct = true;
        isYes = true;
      }      
    } while (!correct);
    return isYes;
  }

  public void pressAnyKey() {
    ui.Printer.println("Press Enter key to continue...");
    try {
      System.in.read();
    } catch (Exception e) {
      // ¯\_(ツ)_/¯
    }    
  }
  

}
