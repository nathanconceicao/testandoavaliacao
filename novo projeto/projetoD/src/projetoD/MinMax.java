package projetoD;

import java.util.Scanner;

public class MinMax {
	//public int capturaNro () {
		//Scanner sc = new Scanner(System.in);
		//int n1;
		//System.out.print("Entre com o n�mero inteiro: ");
		//n1 = sc.nextInt();
		//return n1;
		//}

	public int retornaMin (int n1, int n2, int n3) {
		if (n1 > n2) {
			if (n1 > n3) {
				if (n2 < n3) {
					System.out.println("O menor numero: " + n2);
					return n2;
				} else {
					System.out.println("O menor numero: " + n3);
					return n3;
				}
			} else {
				if (n1 < n2) {
					System.out.println("O menor numero: " + n1);
					return n1;
				} else {
					System.out.println("O menor numero: " + n2);
					return n2;
				}
			}
		} else {
			if (n2 > n3) {
				if (n1 < n3) {
					System.out.println("O menor numero: " + n1);
					return n1;
				} else {
					System.out.println("O menor numero: " + n3);
					return n3;
				}
			} else {
				if (n1 < n2) {
					System.out.println("O menor numero: " + n1);
					return n1;
				} else {
					System.out.println("O menor numero: " + n2);
					return n3;
				}
			}
		}
	}

}
