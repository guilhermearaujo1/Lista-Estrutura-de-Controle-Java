import java.util.Scanner;

public class AlunosMedia {
	public static void main(String[] args) {

		int aprovados = 0;
		int reprovados = 0;
		int recuperacao = 0;
		double mediaAluno = 0.0;
		double mediaSala = 0.0;
		double nota1;
		double nota2;

		for (int i = 1; i <= 6; i++) {

			System.out.println("Digite a primeira nota do Aluno" + i);
			Scanner input = new Scanner(System.in);
			nota1 = input.nextDouble();
			System.out.println("Digite a segunda nota do Aluno" + i);
			nota2 = input.nextDouble();

			mediaAluno = (nota1 + nota2) / 2;
			mediaSala = (nota1 + nota2) / 6;

			if (mediaAluno < 3) {
				System.out.println("\n Media Aluno" + i + ": " + mediaAluno + " REPROVADO");
				reprovados++;
			}

			else if (mediaAluno <= 7) {
				System.out.println("\n Media Aluno" + i + ": " + mediaAluno + " RECUPERAÇÃO");
				recuperacao++;

			}

			else if (mediaAluno > 7) {
				System.out.println("\n Media Aluno" + i + ": " + mediaAluno + " APROVADO");
				aprovados++;
			}

		}

		System.out.println(mediaAluno);
		System.out.println("\n Alunos APROVADOS: " + aprovados);
		System.out.println("\n Alunos REPROVADOS: " + reprovados);
		System.out.println("\n Alunos RECUPERAÇÃO:" + recuperacao);
		System.out.println("\n Média da Turma: " + mediaSala);

	}
}
