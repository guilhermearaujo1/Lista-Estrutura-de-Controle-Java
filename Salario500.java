import java.util.Scanner;

public class Salario500 {
	public static void main(String[] args) {
		double valorSalario;
		double percentualAumento = 0.2;
		double aumentoTotal;
		String nome;

		System.out.println("Informe seu nome: ");
		Scanner leitor = new Scanner(System.in);
		nome = leitor.nextLine();

		while (!nome.equals("fim")) {

			Scanner input = new Scanner(System.in);
			System.out.println("Digite o seu sal�rio: \n");
			valorSalario = input.nextDouble();

			if (valorSalario < 500) {

				aumentoTotal = valorSalario * percentualAumento;
				System.out.println("Parab�ns seu sal�rio agora �: " + (aumentoTotal + valorSalario));

				System.out.println("Informe seu nome: ");
				nome = leitor.nextLine();
			}

			else if (valorSalario > 500) {
				System.out.println("Voc� n�o tem direito ao aumento");

				System.out.println("Informe seu nome: ");
				nome = leitor.nextLine();

			}

		}

	}
}
