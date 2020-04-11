package projetoA;





import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class retornoTeste {


	@Test
	public void testGetterPeso() {
		produto pr = new produto(75, 180);
		double resultadoEsperado = 75;
		double resultadoReal = pr.getPeso();
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	public void testGetterAltura() {
		produto pr = new produto(75, 180);
		double resultadoEsperado = 180;
		double resultadoReal = pr.getAltura();
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	public void testSetterPeso() {
		produto pr = new produto();
		//set eh void
		pr.setPeso(75);
		double resultadoEsperado = 75;
		double resultadoReal = pr.getPeso();
		assertEquals(resultadoEsperado, resultadoReal);
	}
	@Test
	public void testSetterAltura() {
		produto pr = new produto();
		//set eh void
		pr.setAltura(180);
		double resultadoEsperado = 180;
		double resultadoReal = pr.getAltura();
		assertEquals(resultadoEsperado, resultadoReal);
	}

}
