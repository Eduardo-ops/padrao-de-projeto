package pp_buider_ex1;

public class Aluno extends Builder {

	@Override
	public void buildNome() {
		// operação complexa
		pessoa.nome = "Maria";
	}

	@Override
	public void buildCpf() {
		// operação complexa
		pessoa.cpf = 123456789;
	}

	@Override
	public void buildEmail() {
		// operação complexa
		pessoa.email = "maria@maria.com.br";
	}

	@Override
	public void buildTelefone() {
		// operação complexa
		pessoa.telefone = "9999-9999";
	}

	@Override
	public void buildEndereco() {
		// operação complexa
		pessoa.endereco = "Rua 1, 12, Pouso Alegre";
	}

	
}
