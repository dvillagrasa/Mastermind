public class Code {

    private final byte[] code ;

    public Code(byte[] code) {
        if(code == null)  throw new RuntimeException();
        if (hasInvalidNumber(code)) throw new RuntimeException();
        this.code = code;
    }

    public byte[] getCode() {
        return this.code;
    }

    public int getLenght(){
        return code.length;
    }


    private boolean hasInvalidNumber(byte[] code){
        for (byte color : code) {
            if (color < 0) return true;
            if (Character.isDigit((char) color)) return true;
        }
        return false;
    }
}

