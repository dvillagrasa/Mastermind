package core;

import java.util.Arrays;

public class Code {

    private final int[] code ;

    public Code(int[] code) {
        if(code == null)  throw new RuntimeException();
        if(code.length<=0) throw new RuntimeException();
        if (hasInvalidNumber(code)) throw new RuntimeException();
        this.code = code;
    }
    /*Retorna el codi*/
    public int[] getCode() {
        return this.code;
    }
    /*Retorna la longitud del codi*/
    public int getLenght(){
        return code.length;
    }

    /*Funció que ens diu si el caracter introduit es valid o no(qualsevol caracter que no sigui integer)*/
    private boolean hasInvalidNumber(int[] code){
        for (int color : code) {
            if (color < 0) return true;

            if (Character.isDigit((char) color)) return true;
        }
        return false;
    }
    /*Retorna si dos codis son iguals*/
    @Override
    public boolean equals(Object obj) {
        if ( obj == null ) return false;
        if ( this == obj ) return true;
        Code c = (Code) obj;
        return Arrays.equals(this.code, c.code);
    }

    /*Retorna si el color introduït existeix tot i no estar a la mateixa posició actual.*/
    public boolean existColor(int color) {
        for (int secretColor : code) {
            if (secretColor == color)
                return true;
        }
        return false;
    }
    /*Retorna si el color i la posicio es correcta.*/
    public boolean correctPosition(int color, int pos) {
        return code[pos] == color;
    }
}

