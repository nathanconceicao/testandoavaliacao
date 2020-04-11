package projetoE;

import static org.junit.Assert.*;

import org.junit.Test;

public class testemandar {

	@Test
	public void testmensgem() {
		String mensa;
		mensa ="ola tudo bem";
		mandarmensagem md= new mandarmensagem(mensa);
		String mensaretorn;
		mensaretorn = md.mandar();
		assertEquals(mensa, mensaretorn);
	}

}
