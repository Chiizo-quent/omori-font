package listaA;

import java.util.Scanner;

public class A10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Double A, B, Troca1, Troca2;
		System.out.println("Insira o valor A");
		A  = leia.nextDouble();
		System.out.println("Insira o valor B");
		B = leia.nextDouble();
		Troca1 = A;
		Troca2 = B;
		A = Troca2;
		B = Troca1;
		System.out.println("valor de A agora é:" + A + "valor de B agora é:" + B);
	}

}
