package Utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public static byte[] getRandomByteArray(byte numberOfColors, byte lengthCode){
        Random random = new Random();
        byte[] code = new byte[lengthCode];
        for (byte i = 0; i < code.length; i++) {
            code[i] = (byte) random.nextInt();
        }
        return code;
    }

    public static int[] getFullArray(int content ,int length) {
        int[] array = new int[length];
        Arrays.fill(array,content);
        return array;
    }
}
