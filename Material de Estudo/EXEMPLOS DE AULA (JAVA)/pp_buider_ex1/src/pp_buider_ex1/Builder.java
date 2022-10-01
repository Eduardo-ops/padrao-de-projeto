package pp_buider_ex1;

public abstract class Builder {

	protected Pessoa pessoa;
	
	public Builder() {
		pessoa = new Pessoa();
	}
	
	public abstract void buildNome();
	public abstract void buildCpf();
	public abstract void buildEmail();
	public abstract void buildTelefone();
	public abstract void buildEndereco();
	
	public Pessoa getPessoa() {
		return pessoa;
	}
}
