package projetoB;

public class calculadora {
	// atributo
	private int resultado = 0;
	// m�todo somar
	public int somar( int n1, int n2 ){
	resultado = n1 + n2;
	return resultado;
	}
	// m�todo subtrair
	public int subtrair( int n1, int n2 ){
	resultado = n1 - n2;
	return resultado;
	}
	// m�todo multiplicar
	public int multiplicar( int n1, int n2 ){
	resultado = n1 * n2;
	return resultado;
	}
	// m�todo dividir
	public int dividir( int n1, int n2 ){
	resultado = n1 / n2;
	return resultado;
	}
}
