package Controllers;

public class CodeBreaker {
  public int numOfColors;
  public int lengthCode;
  
  public CodeBreaker(int numOfColors, int lengthCode) {
    if(numOfColors <= 0)  throw new RuntimeException();
    if(lengthCode <= 0)  throw new RuntimeException();
    this.numOfColors = numOfColors;
    this.lengthCode = lengthCode;
  }
}
