package projetoF;



public class diferenciaDeIdade {


	public int difer(int idade1, int idade2) {
		int resultadoIdade;
		if(idade1 > idade2) {
			resultadoIdade = idade1;
			System.out.println("a maior idade � : " + idade1);
			return resultadoIdade;
		}else {
			resultadoIdade = idade2;
			System.out.println("a maior idade � : " + idade2);
			return resultadoIdade;
		}
	}
	
	public int subtrair(int idade1, int idade2){
		int resul = idade1 - idade2;
		System.out.println("a diferencia de idade �: "+ resul);
		return resul;
	}


}
