package pp_composite_ex1;

public class Client {

	public static void main(String[] args) {
		//Inicializa quatro retângulos
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        Rectangle r3 = new Rectangle();
        Rectangle r4 = new Rectangle();

        //Inicializa tres componentes do grafico
        Composite g = new Composite();
        Composite g1 = new Composite();
        Composite g2 = new Composite();

        //Cria o grafico
        g1.add(r1);
        g1.add(r2);
        g1.add(r3);
        g2.add(r4);
        
        g.add(g1);
        g.add(g2);
        
        // Imprime a String Ellipse ( Ela imprime o grafico completo).
        g.print();

	}

}
