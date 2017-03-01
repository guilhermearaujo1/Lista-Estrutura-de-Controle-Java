import java.util.Scanner;

public class ContaDoPosto {
	public static void main(String[] args) {
		double refrigerante = 2;
		double litrosGasolina = 0;
		double conta;
		
		System.out.println("Digite quantos litros de gasolina ");
		Scanner input = new Scanner(System.in);
		litrosGasolina = input.nextFloat();
		
		conta = (litrosGasolina * 3.00) + (refrigerante * 2.50);
		System.out.println("O total a pagar é " + conta);
		
	}
}
