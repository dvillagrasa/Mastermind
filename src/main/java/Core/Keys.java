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
    if ( obj == null ) return false;
    if ( this == obj ) return true;
    Keys c = (Keys) obj;
    return Arrays.equals(this.keys, c.keys);
  }
}
