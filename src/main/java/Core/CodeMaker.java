package Core;

import Utils.ArrayUtils;

public class CodeMaker {
  int colors;
  int length;
  public CodeMaker(int colors,int length) {
    this.colors=colors;
    this.length=length;
  }

  public Code generateCode() {
    return new Code(new int[]{});
  }



}
