package listaA;

import java.util.Scanner;

public class A7 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double distancia, tempo, velocidade, litroUsados;
		
		System.out.println("Insira o tempo gasto da viagem");
		tempo = leia.nextDouble();
		System.out.println("Insira a velocidade média");
		velocidade = leia.nextDouble();
		distancia = (tempo * velocidade);
		litroUsados = (distancia/12);
		System.out.println("Sua velocidade foi de: " + velocidade + ". " + "Você ficou: " + tempo + ". " + "na viagem " +
		"Você percorreu: " + distancia + ". " + "e gastou: " + litroUsados + " de litros. ");
		
	}

}
