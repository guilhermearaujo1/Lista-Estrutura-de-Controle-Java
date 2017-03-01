import java.util.Scanner;

public class Pousada {
	public static void main(String[] args) {
		double diariaPreco = 40.0;
		double diariaServico = 0.0;
		String nome;
		double conta;
		double qtdDiaria;

		System.out.println("Digite o seu nome: ");
		Scanner input = new Scanner(System.in);
		nome = input.nextLine();

		System.out.println("Digite a quantas diárias: ");
		qtdDiaria = input.nextInt();

		if (qtdDiaria < 10) {
			diariaServico = 15;
			conta = (qtdDiaria * diariaPreco) + (qtdDiaria * diariaServico);
			System.out.println("Sua conta é: " + conta);

		}

		else if (qtdDiaria >= 10) {
			diariaServico = 8;
			conta = (qtdDiaria * diariaPreco) + (qtdDiaria * diariaServico);
			System.out.println("Sua conta é: " + conta);

		}
	}
}
