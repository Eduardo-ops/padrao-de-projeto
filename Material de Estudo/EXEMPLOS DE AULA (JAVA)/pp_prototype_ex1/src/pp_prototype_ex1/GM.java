package pp_prototype_ex1;

public class GM extends Carro {

	protected GM(GM carro) {
		this.nomeModelo = carro.getNomeModelo();
		this.preco = carro.getPreco();
	}
	
	public GM() {}
	
	public String infoCarro() {
		System.out.println("Carro GM "+this.nomeModelo+" valor "+this.getPreco());
		return null;
	}
	
	@Override
	public Carro clone() throws CloneNotSupportedException{
		return (Carro)super.clone();
	}
}
