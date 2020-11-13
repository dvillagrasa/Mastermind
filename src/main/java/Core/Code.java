package Core;

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

}

