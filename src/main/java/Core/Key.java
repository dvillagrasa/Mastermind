package Core;

public class Key {
  KeyPeg[] key;

  public Key(KeyPeg[] key) {
    this.key = key;
  }

  public int getLength(){
    return key.length;
  }
}
