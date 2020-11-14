package ui;
import java.util.Scanner;
public class Reader {

  
  public int readInt() {
    Scanner scan = new Scanner(System.in);
    int input;
    input = scan.nextInt();
    return input;
  }



  //verificar que el numero esta entre los limites
  public int readInt(String question) {
    int input=-1;
    boolean correct = false;
    do {
      Printer.println(question);
      try {
        input = readInt();
        correct = true;

      } catch (Exception e) {
        Printer.println("Número invalid");
      }
    } while(!correct);
    return input;
  }

  public int readInt(String question,int min, int max) {
    boolean correct = false;
    int input;
    do {
      input =  readInt(question);
      correct = input >= min && input <= max;
    } while(!correct);
    return input;
  }



}
