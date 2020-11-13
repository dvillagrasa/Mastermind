package Utils;

import java.util.Arrays;
import java.util.Random;

public class ArrayUtils {

    public static int[] getRandomIntArray(int numberOfColors, int lengthCode){
        Random random = new Random();
        int[] code = new int[lengthCode];
        for (int i = 0; i < code.length; i++) {
            code[i] = random.nextInt();
        }
        return code;
    }

    public static int[] getFullArray(int content ,int length) {
        int[] array = new int[length];
        Arrays.fill(array,content);
        return array;
    }
}
