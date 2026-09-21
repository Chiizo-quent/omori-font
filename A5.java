package listaA;

import java.util.Scanner;

public class A5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double preco, desconto, preco_vista;
		System.out.println("Insira o Preço");
		preco = leia.nextDouble();
		desconto = (preco/100);
		desconto = (desconto*10);
		preco_vista = (preco - desconto);
		System.out.println("O preço deste produto é:" + preco + "O desconto é:" + desconto + "o preço a vista é:" 
		+ preco_vista + ".");

	}

}
