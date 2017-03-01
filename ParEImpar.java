import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		int i = 0;

		while (i != 10) {
			i++;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite um numero: ");
			int num = entrada.nextInt();

			if (num % 2 == 0) {
				System.out.println("par");
			}

			if (num % 2 != 0) {
				System.out.println("impar");
			}

		}
	}
}
