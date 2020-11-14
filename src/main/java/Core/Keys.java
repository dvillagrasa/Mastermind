package Core;

import java.util.Arrays;

public class Keys {
  KeyPeg[] keys;

  public Keys(KeyPeg[] keys) {
    if(keys.length==0) throw new RuntimeException();
    if(keys==null) throw new RuntimeException();
    this.keys = keys;

  }

  public int getLength(){
    return keys.length;
  }

  public KeyPeg[] getKeys() {
    return this.keys;
  }

  @Override
  public boolean equals(Object obj) {
    return true;
  }
}
