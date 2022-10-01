package pp_buider_ex1;

public class Director {

	protected Builder aluno;
	
	public Director(Builder aluno) {
		this.aluno = aluno;
	}
	
	public void constroiAluno() {
		aluno.buildNome();
		aluno.buildCpf();
		aluno.buildEndereco();
		aluno.buildEmail();
		aluno.buildTelefone();
	}
	
	public Pessoa getPessoa() {
		return aluno.getPessoa();
	}
}
