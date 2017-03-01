
public class Emprestimo {
	public String nomeUsuario;
	public float valorEmprestimo, percentualJurosMes, mesesParaPagar;
	public int idade;
	
public void imprimir(){
	System.out.println("\n Nome: " + nomeUsuario);
	System.out.println("\n Idade: " + idade);
	System.out.println("\n Valor do Emprestimo: " +valorEmprestimo);
	System.out.println("\n Juros: " +percentualJurosMes);
	System.out.println("\n Meses para pagamento: " +mesesParaPagar);
}

public void calcularEmprestimo(){
	if(idade >= 18 && idade < 23){
		valorEmprestimo += (valorEmprestimo / mesesParaPagar) * (percentualJurosMes / 100);
		
		
	}
	if(idade > 23 && idade <= 33){
		valorEmprestimo += (valorEmprestimo * 10) / 100;
	}
	
}

public String getNomeUsuario() {
	return nomeUsuario;
}

public void setNomeUsuario(String nomeUsuario) {
	this.nomeUsuario = nomeUsuario;
}

public float getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public float getValorEmprestimo() {
	return valorEmprestimo;
}

public void setValorEmprestimo(float valorEmprestimo) {
	this.valorEmprestimo = valorEmprestimo;
}

public float getPercentualJurosMes() {
	return percentualJurosMes;
}

public void setPercentualJurosMes(float percentualJurosMes) {
	this.percentualJurosMes = percentualJurosMes;
}

public float getMesesParaPagar() {
	return mesesParaPagar;
}

public void setMesesParaPagar(float mesesParaPagar) {
	this.mesesParaPagar = mesesParaPagar;
}

}

