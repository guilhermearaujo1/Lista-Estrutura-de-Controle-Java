import java.util.Scanner;

public class Clinica {
	public static void main(String[] args) {
		// VARIAVEIS
		String nome, sexo, nomeMulherMaisBaixa = "", nomePacienteMaisVelho = "";
		double peso, altura, media, menorAltura = 7;
		double idade = 0, pacientes = 0, qtdHomem = 0, somaIdadeHomem = 0, qtdIdade18 = 0, qtdMulher = 0,
				qtdMulherAlturaPeso = 0, idadeMaisVelha = 0;

		while (true) {
			System.out.println("Informe seu NOME , SEXO(masculino ou feminino) , PESO, IDADE, ALTURA");
			Scanner input = new Scanner(System.in);
			nome = input.nextLine();
			if (nome.equals("fim")) {
				break;
			}
			pacientes++;
			sexo = input.nextLine();
			peso = input.nextDouble();
			idade = input.nextDouble();
			altura = input.nextDouble();

			if (sexo.equals("masculino")) {
				qtdHomem++;
				somaIdadeHomem = somaIdadeHomem + idade;

			}

			if (sexo.equals("feminino")) {
				qtdMulher++;
				// QUANTIDADE DE MULHER ENTRE ALTURA 1,6 E 1,70 E PESO X
				if (altura >= 1.6 && altura <= 1.7 && peso > 70) {
					qtdMulherAlturaPeso++;
				}
				// NOME DA MULHER MAIS BAIXA
				if (altura < menorAltura) {
					menorAltura = altura;
					nomeMulherMaisBaixa = nome;

				}

			}

			// IDADE ENTRE 18 E 25 ANOS
			if (idade >= 18 && idade <= 25) {
				qtdIdade18++;
			}

			// NOME DO PACIENTE MAIS VELHO
			if (idade > idadeMaisVelha) {
				idadeMaisVelha = idade;
				nomePacienteMaisVelho = nome;
			}

		}
		System.out.println("Total de pacientes: " + pacientes);
		System.out.println("Média da idade dos homens: " + (somaIdadeHomem / qtdHomem));
		System.out.println("A quantidade de mulheres entre altura 1,6 e 1,70 com peso 70: " + qtdMulherAlturaPeso);
		System.out.println("Nome da mulher mais baixa: " + nomeMulherMaisBaixa);
		System.out.println("Quantidade de pacientes com idade entre 18 e 25 anos: " + qtdIdade18);
		System.out.println("Nome do pacientes mais velho: " + nomePacienteMaisVelho);
	}
}
