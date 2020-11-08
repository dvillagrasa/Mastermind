public class Code {

    private final byte[] code ;

    public Code(byte[] code) {
        if(code == null) {
            throw new RuntimeException();
        }
        this.code = code;
    }

    public byte[] getCode() {
        return this.code;
    }

    public int getLenght(){
        return code.length;
    }
}

