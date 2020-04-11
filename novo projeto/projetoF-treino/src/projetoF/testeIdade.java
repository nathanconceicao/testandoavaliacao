package projetoF;

import static org.junit.Assert.*;

import org.junit.Test;

public class testeIdade {

	@Test
	public void testidade() {
		int n1 = 5;
		int n2 = 6;
		diferenciaDeIdade di = new diferenciaDeIdade();
		int resultadoEsp = n2;
		int resultadoReal = di.difer(n1, n2);
		assertEquals(resultadoEsp, resultadoReal);
	}
	
	@Test
	public void testsub() {
		int n1 = 5;
		int n2 = 4;
		diferenciaDeIdade di = new diferenciaDeIdade();
		int resultadoEsp = 1;
		int resultadoReal = di.subtrair(n1, n2);
		assertEquals(resultadoEsp, resultadoReal);
	}

}
