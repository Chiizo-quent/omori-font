package listaA;

import java.util.Scanner;

public class A6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double ht, vh, pd, sb, sl, td;
		System.out.println("Insira o total de horas trabalhadas no mês");
		ht = leia.nextDouble();
		System.out.println("Insira o valor de cada hora trabalhada");
		vh = leia.nextDouble();
		System.out.println("Insira o percentual do desconto");
		pd = leia.nextDouble();
		sb = ( ht * vh );
		td = ( pd/100);
		td = ( td * sb );
		sl = ( sb - td );
		System.out.println("O salário bruto é : " + sb + ". " + "O líquido é : " + sl + ". " + "O deconto é de: " 
		+ td + ". ");
	}

}
