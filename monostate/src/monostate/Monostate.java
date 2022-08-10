package monostate;

/*
 * O Monostate é geralmente referido como sintático sobre o Singleton ou como conceito de Singleton .
	Evita todas as complicações de ter uma única instância de uma classe, mas todas as instâncias usam os mesmos dados.
	Isso é feito principalmente usando staticmembros de dados.
	Uma das características mais importantes é que é absolutamente transparente para os usuários, 
	que desconhecem completamente que estão trabalhando com um arquivo Monostate. 
	Os usuários podem criar quantas instâncias de a Monostatequiserem e qualquer instância é boa para acessar os dados.
	A Monostateclasse geralmente vem com uma classe complementar que é usada para atualizar as configurações, se necessário.
*/

public class Monostate {

	private static int largura;
	private static int altura;

	public int getLargura() {
		return Monostate.largura;
	}

	public void setLargura(int largura) {
		Monostate.largura = largura;
	}

	public int getAlgura() {
		return Monostate.altura;
	}

	public void setAlgura(int algura) {
		Monostate.altura = algura;
	}

	static {
		largura = 42;
		altura = 128;
	}

}
