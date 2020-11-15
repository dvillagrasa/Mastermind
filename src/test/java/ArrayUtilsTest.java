import Utils.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class ArrayUtilsTest {

    /*Test de Caixa Negra:
    * Particions equivalents*/
    @Test
    public void getRandomIntArrayTest(){
       int numberOfColors = 2;
       int lengthCode = 5;

       //Aqui verifiquem que les longituds son iguals
       int[] randomIntArray =  ArrayUtils.getRandomIntArray(numberOfColors,lengthCode);
       Assertions.assertEquals(randomIntArray.length,lengthCode);

       //Verifiquem que dos arrays generats aleatoriament no siguin iguals
       int[] randomIntArray3 = ArrayUtils.getRandomIntArray(numberOfColors,lengthCode);
       Assertions.assertNotEquals(randomIntArray, randomIntArray3);
       //Verifiquem que si pasem una longitud no valida
       Assertions.assertThrows(RuntimeException.class,()-> ArrayUtils.getRandomIntArray(numberOfColors,-1));
       Assertions.assertThrows(RuntimeException.class,()-> ArrayUtils.getRandomIntArray(numberOfColors,0));

    }

  /*Test de Caixa Negra:
   * Particions equivalents*/
    @Test
    public void getFullArrayTest(){
        int content=-1;
        int length=5;
        int [] array={-1,-1,-1,-1,-1};
        //Probem el cas en que el contingut d'un array i una longitud
        // y un array creat (amb el mateix contingut), donin el mateix resultat
        Assertions.assertArrayEquals(array,ArrayUtils.getFullArray(content,length));
        //Probem el cas en que el contingut d'un array i una longitud
        // y un array creat (amb diferent contingut), donin diferent resultat
        Assertions.assertNotEquals(array,ArrayUtils.getFullArray(1,length));
    }



}
