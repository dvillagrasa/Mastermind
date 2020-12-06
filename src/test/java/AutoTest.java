import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import controllers.CodeBreaker;
import controllers.CodeMaker;
import controllers.Game;
import core.Code;
import mocks.mockCodeBreaker;
import mocks.mockCodeMakerComputer;
import ui.Menu;

public class AutoTest {
	
	/**
	 * Victoria en el primer intento
	 */
	@Test
	public void testPartida1() {
		System.out.println("");
		System.out.println("---------------- TEST PARTIDA 1 ----------------------");
		Menu menu = new Menu();
		menu.selectOption(0);
		
		Code secretCode = new Code(new int[]{0,1,2,3});
		
		//Numero de colores = 4
        CodeMaker codeMaker = new mockCodeMakerComputer(4, secretCode);

        Code[] guesses =  {
            new Code(new int[]{0,1,2,3})
        };
        
        //Numero de colores = 4, Tam combinacion = 4
        CodeBreaker codeBreaker1 = new mockCodeBreaker(4, 4, guesses);
        
        // Num intentos = 4
        Game game1 = new Game(codeMaker, codeBreaker1, 4);
        game1.start();
        
        Assertions.assertTrue(game1.hasCodeBreakerWon());
        Assertions.assertFalse(game1.hasCodeBreakerLost());
        Assertions.assertTrue(game1.isGameOver());
        
        if(game1.hasCodeBreakerWon()) {
        	System.out.println("VICTORIA PARTIDA 1");
        } else {
        	System.out.println("DERROTA PARTIDA 1");
        }
        System.out.println("---------------- FINAL TEST PARTIDA 1 ----------------");
	}
	
	/**
	 * Victoria en el segundo intento
	 */
	@Test
	public void testPartida2() {
		System.out.println("");
		System.out.println("---------------- TEST PARTIDA 2 ----------------------");
		Menu menu = new Menu();
		menu.selectOption(0);
		
		Code secretCode = new Code(new int[]{0,1,2,3});
        CodeMaker codeMaker = new mockCodeMakerComputer(4, secretCode);

        Code[] guesses2 =  {
            new Code(new int[]{1,1,1,1}),
            new Code(new int[]{0,1,2,3})
        };
        CodeBreaker codeBreaker2 = new mockCodeBreaker(4, 4, guesses2);
        Game game2 = new Game(codeMaker, codeBreaker2, 4);
        game2.start();
        
        Assertions.assertTrue(game2.hasCodeBreakerWon());
        Assertions.assertFalse(game2.hasCodeBreakerLost());
        Assertions.assertTrue(game2.isGameOver());
        
        if(game2.hasCodeBreakerWon()) {
        	System.out.println("VICTORIA PARTIDA 2");
        } else {
        	System.out.println("DERROTA PARTIDA 2");
        }
        System.out.println("---------------- FINAL TEST PARTIDA 2 ----------------");
	}
	
	/**
	 * Victoria en el tercer intento
	 */
	@Test
	public void testPartida3() {
		System.out.println("");
		System.out.println("---------------- TEST PARTIDA 3 ----------------------");
		Menu menu = new Menu();
		menu.selectOption(0);
		
		Code secretCode = new Code(new int[]{0,1,2,3});
        CodeMaker codeMaker = new mockCodeMakerComputer(4, secretCode);

        Code[] guesses3 =  {
            new Code(new int[]{1,1,1,1}),
            new Code(new int[]{0,1,1,3}),
            new Code(new int[]{0,1,2,3})
        };
        CodeBreaker codeBreaker3 = new mockCodeBreaker(4, 4, guesses3);
        Game game3 = new Game(codeMaker, codeBreaker3, 4);
        game3.start();
        
        Assertions.assertTrue(game3.hasCodeBreakerWon());
        Assertions.assertFalse(game3.hasCodeBreakerLost());
        Assertions.assertTrue(game3.isGameOver());
        
        if(game3.hasCodeBreakerWon()) {
        	System.out.println("VICTORIA PARTIDA 3");
        } else {
        	System.out.println("DERROTA PARTIDA 3");
        }
        System.out.println("---------------- FINAL TEST PARTIDA 3 ----------------");
	}
	
	/**
	 * Victoria en el cuarto intento
	 */
	@Test
	public void testPartida4() {
		System.out.println("");
		System.out.println("---------------- TEST PARTIDA 4 ----------------------");
		Menu menu = new Menu();
		menu.selectOption(0);
		
		Code secretCode = new Code(new int[]{0,1,2,3});
        CodeMaker codeMaker = new mockCodeMakerComputer(4, secretCode);

        Code[] guesses4 =  {
            new Code(new int[]{1,1,1,1}),
            new Code(new int[]{0,1,1,3}),
            new Code(new int[]{0,1,0,3}),
            new Code(new int[]{0,1,2,3})
        };
        CodeBreaker codeBreaker4 = new mockCodeBreaker(4, 4, guesses4);
        Game game4 = new Game(codeMaker, codeBreaker4, 4);
        
        game4.start();
        Assertions.assertTrue(game4.hasCodeBreakerWon());
        Assertions.assertFalse(game4.hasCodeBreakerLost());
        Assertions.assertTrue(game4.isGameOver());
        
        if(game4.hasCodeBreakerWon()) {
        	System.out.println("VICTORIA PARTIDA 4");
        } else {
        	System.out.println("DERROTA PARTIDA 4");
        }
        System.out.println("---------------- FINAL TEST PARTIDA 4 ----------------");
	}
	@Test
	public void testPartida5() {
		
		System.out.println("---------------- TEST PARTIDA 5 ----------------------");
		Menu menu = new Menu();
		menu.selectOption(0);
		
		Code secretCode = new Code(new int[]{8,7,6,5});
		
		//Numero de colores = 4
        CodeMaker codeMaker = new mockCodeMakerComputer(9, secretCode);

        Code[] guesses =  {
            new Code(new int[]{0,1,2,3}),
            new Code(new int[]{8,0,5,6}),
            new Code(new int[]{6,8,0,2}),
            new Code(new int[]{8,7,6,5}) //Gana aqui
        };
        
        //Numero de colores = 4, Tam combinacion = 4
        CodeBreaker codeBreaker1 = new mockCodeBreaker(9, 4, guesses);
        
        // Num intentos = 4
        Game game5 = new Game(codeMaker, codeBreaker1, 4);
        game5.start();
        
        Assertions.assertTrue(game5.hasCodeBreakerWon());
        Assertions.assertFalse(game5.hasCodeBreakerLost());
        Assertions.assertTrue(game5.isGameOver());
		
        if(game5.hasCodeBreakerWon()) {
        	System.out.println("VICTORIA PARTIDA 5");
        } else {
        	System.out.println("DERROTA PARTIDA 5");
        }
        System.out.println("---------------- FINAL TEST PARTIDA 5 ----------------");
	}
	
	@Test
	public void testPartida6() {
		System.out.println("");
		System.out.println("---------------- TEST PARTIDA 6 ----------------------");
		Menu menu = new Menu();
		menu.selectOption(0);
		
		Code secretCode = new Code(new int[]{3,6,8,5,1,0,7});
		
		//Numero de colores = 4
        CodeMaker codeMaker = new mockCodeMakerComputer(9, secretCode);

        Code[] guesses =  {
            new Code(new int[]{1,6,8,5,1,0,7}),
            new Code(new int[]{4,8,8,5,9,0,7}),
            new Code(new int[]{2,4,1,2,1,0,7}),
            new Code(new int[]{3,4,1,8,0,0,7}),
            new Code(new int[]{5,4,2,2,1,0,7}),
            new Code(new int[]{7,4,1,2,1,0,7}),
            new Code(new int[]{3,5,8,5,1,0,2})
        };
        
        //Numero de colores = 4, Tam combinacion = 4
        CodeBreaker codeBreaker1 = new mockCodeBreaker(9, 7, guesses);
        
        // Num intentos = 4
        Game game6 = new Game(codeMaker, codeBreaker1, 7);
        game6.start();
        
        Assertions.assertFalse(game6.hasCodeBreakerWon());
        Assertions.assertTrue(game6.hasCodeBreakerLost());
        Assertions.assertTrue(game6.isGameOver());
        
        if(game6.hasCodeBreakerWon()) {
        	System.out.println("VICTORIA PARTIDA 6");
        } else {
        	System.out.println("DERROTA PARTIDA 6");
        }
        System.out.println("---------------- FINAL TEST PARTIDA 6 ----------------");
	}
}
