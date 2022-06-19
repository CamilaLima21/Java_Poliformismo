
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func1 = new Gerente();
		func1.setNome("Camila Marques");
		func1.setCpf("12345678900");
		func1.setSalario(2600.00);
		
		System.out.println(func1.getNome());
		System.out.println(func1.getBonificacao());
		
		//func1.salario = 300.0;
	}

}
