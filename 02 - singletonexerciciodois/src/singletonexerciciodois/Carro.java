package singletonexerciciodois;

public class Carro {

	private static Carro carro = null;
	private String statusCarro;

	private Carro() {

	}

	public static Carro getInstanceCar() {
		if (carro == null) {
			carro = new Carro();
		}
		return carro;
	}

	public void ligarCarro() {
		System.out.println("Ligando carro...");
		this.statusCarro = "Ligado";
		System.out.println("Carro " + statusCarro);
	}

	public void desligarCarro() {
		System.out.println("Desligando carro...");
		this.statusCarro = "Desligado";
		System.out.println("Carro " + statusCarro);
	}

	public static Carro getCarro() {
		return carro;
	}

	public static void setCarro(Carro carro) {
		Carro.carro = carro;
	}

	public String getStatusCarro() {
		return statusCarro;
	}

	public void setStatusCarro(String statusCarro) {
		this.statusCarro = statusCarro;
	}

}
