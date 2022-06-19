// Gerente herda da classe Funiconario
public class Gerente extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do GERENTE!");
		return super.getSalario();
	}	
	
}
