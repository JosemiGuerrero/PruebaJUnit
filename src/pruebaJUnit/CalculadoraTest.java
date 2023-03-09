package pruebaJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private Calculadora c;
	
	@BeforeEach
	public void creaCalculadora() {
		
		c = new Calculadora(20,10);
	}
	
	@AfterEach	
	public void borraCalculadora() {
		
		c = null;
	}
	
	@Test
	void testSuma() {
		double esperado = 30;
		double res = c.suma();
		assertEquals(esperado, res, 0, "Fallo en la suma"); //El tercer valor es el delta de lo que puede variar el resultado
	}

	@Test
	void testResta() {
		double esperado = 10;
		double res = c.resta();
		assertEquals(esperado, res, 0, "Fallo en la resta");
	}

	@Test
	void testMultiplicacion() {
		double esperado = 2000; //falla a proposito (200)
		double res = c.multiplicacion();
		assertEquals(esperado, res, 0, "Fallo en la multiplicación");
	}

	@Test
	void testDivision() {
		double esperado = 2;
		double res = c.division();
		assertEquals(esperado, res, 0, "Fallo en la división");
	}
	
//	@Test
//	public void testException() {
//		
//		try {
//			
//				Calculadora calc = new Calculadora(20, 0);
//				double res = calc.division();
//				fail("FALLO, debería entrar en la excepción");
//			}
//		catch(ArithmeticException e) {
//			
//			//Prueba exitosa
//		}
//	}

	@Test
	void testDivison0_01() {
		
		Calculadora calc = new Calculadora (20, 0);
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calc.division0();
			});
	}
	
	@Test
	public void testDivision0_02() {
		
		Calculadora calc = new Calculadora (20, 2);
		Assertions.assertThrows(ArithmeticException.class, () -> {
			calc.division0();
			});
	}
}
