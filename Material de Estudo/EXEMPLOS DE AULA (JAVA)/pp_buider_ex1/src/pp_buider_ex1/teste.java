package pp_buider_ex1;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Director x 	= new Director(new Aluno());	
		
		x.constroiAluno();
		Pessoa p = x.getPessoa();
		System.out.println("Nome: "+p.nome+"\nCpf: "+p.cpf+"\nEnd.: "+p.endereco+"\nE-mail: "+p.email+"\nTel.: "+p.telefone);
	}

}
