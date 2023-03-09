package pruebaJUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class FactorialTest {

	@Test
	void testCalculoCalculo() {
		
		double esperado = 6;
		double f = Factorial.calculo(3);
		assertEquals(esperado, f, 0, "Fallo en el calculo");
	}

	@Test
	void testCalculoIllegalArgument() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.calculo(-8));
	}
	
	@Test
	void testCalculoArithmetic() {
		
		Assertions.assertThrows(ArithmeticException.class, () -> Factorial.calculo(20));
	}
	
	@ParameterizedTest
	@CsvSource({"5, 120", "7, 5040"})
	void testParameterized(int f, int exp) {
		int res = Factorial.calculo(f);
		assertEquals(exp, res);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"Hola", "Mundo"})
	void mensajeNuloTest(String c) {
		
		assertDoesNotThrow(()-> Factorial.mensajeNoNulo(c));
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"False", "Falso"})
	void comparaTest(String c) {
		
		assertEquals(false, Factorial.compara(c));
	}
}