import java.util.Scanner;

public class LinhaDeCredito {
	public static void main(String[] args) {
		double salarioBruto;
		double prestacao;
		
		System.out.println("Informe o valor do salario bruto\n");
		Scanner input = new Scanner(System.in);
		salarioBruto = input.nextDouble();
		
		System.out.println("Informe o valor da presta��o\n");
		prestacao = input.nextDouble();
		
		if(prestacao <= (salarioBruto*0.30)){
			System.out.println("Empr�stimo feito\n");
		}
		else{
			System.out.println("N�o pode ser concedidoa\n");
		}
		
	}
}
