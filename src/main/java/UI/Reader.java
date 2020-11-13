package UI;
import java.util.Scanner;
import UI.Printer;
public class Reader {
  public static int readInt() {
    //String s = System.console().readLine();
    Scanner scan = new Scanner(System.in);
    //scan.close();
    int input;
    boolean incorrect = false;
    do {
      try {
        input = scan.nextInt();
        return input;
      } catch (Error e) {
        Printer.println("Invalid value");
        incorrect = true;
      }
    } while(true);

  }
  public static boolean checkNumColors(int numc){
    return numc >= 4 && numc <= 26;
  }

  public static boolean checkCodeLength(int codel){
    return codel >= 4 && codel <= 6;
  }

  //verificar que el numero esta entre los limites
  public static int readInt(String question) {
    Printer.println(question);
    Printer.print("> ");
    return readInt();
  }

  public static int readInt(String question,int min, int max) {
    boolean correct = false;
    int num;
    do {
      num =  readInt(question);
      correct = num >= min && num <= max;
    } while(!correct);
    return num;
  }

}
