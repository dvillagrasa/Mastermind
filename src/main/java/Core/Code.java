package Core;

import java.util.Arrays;

public class Code {

    private final int[] code ;

    public Code(int[] code) {
        if(code == null)  throw new RuntimeException();
        if (hasInvalidNumber(code)) throw new RuntimeException();
        this.code = code;
    }

    public int[] getCode() {
        return this.code;
    }

    public int getLenght(){
        return code.length;
    }


    private boolean hasInvalidNumber(int[] code){
        for (int color : code) {
            if (color < 0) return true;

            if (Character.isDigit((char) color)) return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj == null ) return false;
        if ( this == obj ) return true;
        Code c = (Code) obj;
        return Arrays.equals(this.code, c.code);
    }


    public boolean existColor(int color) {
        for (int secretColor : code) {
            if (secretColor == color)
                return true;
        }
        return false;
    }


}

