package core;

import java.util.Arrays;

public class Keys {
  KeyPeg[] keys;

  public Keys(KeyPeg[] keys) {
    if(keys.length==0) throw new RuntimeException();
    if(keys==null) throw new RuntimeException();
    this.keys = keys;
  }
  /*Retorna la longitud de la clau*/
  public int getLength(){
    return keys.length;
  }
  /*Retorna el conjunt de claus*/
  public KeyPeg[] getKeys() {
    return this.keys;
  }
  /*Retorna si 2 claus son iguals o no*/
  @Override
  public boolean equals(Object obj) {
    if ( obj == null ) return false;
    if ( this == obj ) return true;
    Keys c = (Keys) obj;
    return Arrays.equals(this.keys, c.keys);
  }
}
