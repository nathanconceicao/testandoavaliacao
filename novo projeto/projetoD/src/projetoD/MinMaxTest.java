package projetoD;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinMaxTest {

	/*@Test
	public void testDigitacao() {
	int nroDigitado = 0;
	int valEsperado = 1;
	MinMax comparadora = new MinMax();
	nroDigitado = comparadora.capturaNro();
	assertEquals(nroDigitado, valEsperado);
	}*/

//	@Test
//	public void testDigitacao() {
//		int nroDigitado = 0;
//		int valEsperado = 1;
//		MinMax comparadora = new MinMax();
//		nroDigitado = comparadora.capturaNro();
//		assertEquals(nroDigitado, valEsperado);
//	}
	@Test
	public void testMin() {
		int nroDigitado1 = 0;
		int nroDigitado2 = 1;
		int nroDigitado3= 2;
		int valEsperado = 0;
		MinMax apuradoraMin = new MinMax();
		int nroMinEncontrado = apuradoraMin.retornaMin(nroDigitado1, nroDigitado2, nroDigitado3);
		assertEquals(nroMinEncontrado, valEsperado);
	}
}
