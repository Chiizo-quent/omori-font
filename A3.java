package listaA;

import java.util.Scanner;

public class A3 {

	public static void main(String[] args) {
		double F, C, Temp;
		Scanner leia = new Scanner(System.in);		

		System.out.println("Quantos graus é?");
		C = leia.nextDouble();
		F = (C*9/5 + 32);
		System.out.println("graus em fahrenheit é:" + F + ".");
	}

}
