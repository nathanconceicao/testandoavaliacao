package projetoG;

import static org.junit.Assert.*;

import org.junit.Test;

public class testImc {

	@Test
	public void test() {
		float n1=(float) 1.90;
		float n2=(float) 100.00;
		float n3 = (float) 27.0;
		imc i = new imc();
		float resultEsp = n3;
		float resultReal = (float) i.imcTotal(n1, n2);
		assertEquals(resultEsp, resultReal);
	}

}
