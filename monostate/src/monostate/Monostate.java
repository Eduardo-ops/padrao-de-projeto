package monostate;

/*
 * O Monostate � geralmente referido como sint�tico sobre o Singleton ou como conceito de Singleton .
	Evita todas as complica��es de ter uma �nica inst�ncia de uma classe, mas todas as inst�ncias usam os mesmos dados.
	Isso � feito principalmente usando staticmembros de dados.
	Uma das caracter�sticas mais importantes � que � absolutamente transparente para os usu�rios, 
	que desconhecem completamente que est�o trabalhando com um arquivo Monostate. 
	Os usu�rios podem criar quantas inst�ncias de a Monostatequiserem e qualquer inst�ncia � boa para acessar os dados.
	A Monostateclasse geralmente vem com uma classe complementar que � usada para atualizar as configura��es, se necess�rio.
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
