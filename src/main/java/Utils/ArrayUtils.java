package Utils;

import java.util.Arrays;


public class ArrayUtils {

    public static int[] getRandomIntArray(int numberOfColors, int lengthCode){
        Utils.Random random = new Utils.Random();
        int[] code = new int[lengthCode];
        if(code.length<=0) throw new RuntimeException();
        for (int i = 0; i < code.length; i++) {
            code[i] = random.nextInt(numberOfColors);
        }
        return code;
    }

    public static int[] getFullArray(int content ,int length) {
        int[] array = new int[length];
        Arrays.fill(array,content);
        return array;
    }
}
