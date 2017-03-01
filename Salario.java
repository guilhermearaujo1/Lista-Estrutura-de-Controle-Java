import java.util.Scanner;

public class Salario {
	double valorSalario;
	double percentualAumento;
	double aumentoTotal;

	public void aumentando() {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite o seu salário: \n");
		valorSalario = input.nextDouble();
		System.out.println("Digite o percentual: \n");
		percentualAumento = input.nextDouble();

		aumentoTotal = valorSalario * percentualAumento;

		System.out.println("Parabéns seu salário agora é: " + (aumentoTotal + valorSalario));
	}

	public double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}

	public void setPercentualAumento(double percentualAumento) {
		this.percentualAumento = percentualAumento;
	}

	public void setAumentoTotal(double aumentoTotal) {
		this.aumentoTotal = aumentoTotal;
	}

	public void setValorSalario(float valorSalario) {
		this.valorSalario = valorSalario;
	}

	public double getPercentualAumento() {
		return percentualAumento;
	}

	public void setPercentualAumento(float percentualAumento) {
		this.percentualAumento = percentualAumento;
	}

	public double getAumentoTotal() {
		return aumentoTotal;
	}

	public void setAumentoTotal(float aumentoTotal) {
		this.aumentoTotal = aumentoTotal;
	}
}
