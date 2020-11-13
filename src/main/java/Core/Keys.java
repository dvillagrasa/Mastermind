package Core;

public class Keys {
  KeyPeg[] key;

  public Keys(KeyPeg[] key) {
    if(key.length==0) throw new RuntimeException();
    if(key==null) throw new RuntimeException();
    this.key = key;

  }

  public int getLength(){
    return key.length;
  }
}
