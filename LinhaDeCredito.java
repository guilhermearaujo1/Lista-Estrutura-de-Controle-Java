import java.util.Scanner;

public class LinhaDeCredito {
	public static void main(String[] args) {
		double salarioBruto;
		double prestacao;
		
		System.out.println("Informe o valor do salario bruto\n");
		Scanner input = new Scanner(System.in);
		salarioBruto = input.nextDouble();
		
		System.out.println("Informe o valor da prestação\n");
		prestacao = input.nextDouble();
		
		if(prestacao <= (salarioBruto*0.30)){
			System.out.println("Empréstimo feito\n");
		}
		else{
			System.out.println("Não pode ser concedidoa\n");
		}
		
	}
}
