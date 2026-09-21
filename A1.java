package listaA;

import java.util.Scanner;

//67 67 67 67 67 67 67 67


public class A1 {
	public static void main(String[] args) {
		double num1, num2, num3, num4 , sNum, mNum;//Declaração de Variáveis
		Scanner leia = new Scanner(System.in);//Declarando o Scanner, para a entrada de dados.
		
	
		System.out.println("Digite o 1° valor");//Escreva
		num1 = leia.nextDouble();
		System.out.println("Digite o 2° valor");//Escreva
		num2 = leia.nextDouble();
		System.out.println("Digite o 3° valor");//Escreva
		num3 = leia.nextDouble();
		System.out.println("Digite o 4° valor");//Escreva
		num4 = leia.nextDouble();

		sNum = (num1 + num2 + num3 + num4);
		mNum = (sNum / 4);
		System.out.println("Sua nota é:" + mNum + ".");	
	}

}
