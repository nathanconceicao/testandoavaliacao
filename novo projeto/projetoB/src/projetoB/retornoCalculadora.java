package projetoB;

import static org.junit.Assert.*;

import org.junit.Test;

public class retornoCalculadora {

	@Test
	public void testcalculadora() {
		int nro1 = 5;
		int nro2 = 5;
		calculadora calc = new calculadora();
		int resultadoEsperado=10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
