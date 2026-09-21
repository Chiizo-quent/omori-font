package listaA;

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
		double l1, l2, area;
		Scanner leia = new Scanner(System.in);
		System.out.println("DIGITE O VALOR DO 1° LADO");
		l1 = leia.nextDouble();
		System.out.println("DIGITE O VALOR DO 2° LADO");
		l2 = leia.nextDouble();
		
		area = ( l1 * l2 );
		System.out.println("A area é: " + area + ".");
	}

}
