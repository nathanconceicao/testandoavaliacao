package projetoC;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMensagem {

	@Test
	public void testeCriaMesnsagemPadrao() {
	String mensx;
	mensx = "nathan";
	BoasVindas mensagemUsuario = new BoasVindas(mensx);
	String mensretorno = mensagemUsuario.completarMenssagem();
	assertEquals("Ola! Seja bem vindo a sua calculadora pessoal", mensretorno);
	}
	@Test
	public void testeExibeMesnsagem() {
	String mensx;
	mensx = "nathan chefe";
	BoasVindas mensagemUsuario = new BoasVindas(mensx);
	String mensRetorno;
	mensRetorno = mensagemUsuario.exibirMenssagem();
	assertEquals(mensx, mensRetorno);
	}

}
