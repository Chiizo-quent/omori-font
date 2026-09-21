package listaA;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
	double raio, altura, volume;
	Scanner leia = new Scanner(System.in);
	
	System.out.println("DIGITE O VALOR DO RAIO");
	raio = leia.nextDouble();
	System.out.println("DIGITE O VALOR DA ALTURA");
	altura = leia.nextDouble();
	volume = (3.14159 * raio * raio * altura);
	System.out.println("O VOLUME É:" + volume + ".");
	

	}

}
