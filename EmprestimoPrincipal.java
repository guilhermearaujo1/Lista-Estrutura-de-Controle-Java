import java.util.Scanner;

public class EmprestimoPrincipal {
	public static void main(String[] args) {
		Emprestimo emprestimo = new Emprestimo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Cadastro para realizar empréstimo\n");
		System.out.println(" Nome: ");
		emprestimo.nomeUsuario = input.nextLine();
		System.out.println("\n Idade: ");
		emprestimo.idade = input.nextInt();
		System.out.println("\n Valor Empréstimo: ");
		emprestimo.valorEmprestimo = input.nextFloat();
		System.out.println("\n Meses para pagamento: ");
		emprestimo.mesesParaPagar = input.nextFloat();
		System.out.println("\n Juros: ");
		emprestimo.percentualJurosMes = input.nextFloat();
		
		emprestimo.calcularEmprestimo();
		input.close();
		
		emprestimo.imprimir();
		
	}
}
