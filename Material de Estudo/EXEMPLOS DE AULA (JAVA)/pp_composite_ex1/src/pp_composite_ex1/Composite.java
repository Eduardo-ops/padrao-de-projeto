package pp_composite_ex1;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Graphic{

	//Coleção de Graficos  filhos
    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    //Printa o grafico
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    //Adiciona um gráfico  na composição
    @Override
    public void add(Graphic g) {
        childGraphics.add(g);
    }
    
    //Remove uma forma da composição
    @Override
    public void remove(Graphic g) {
        childGraphics.remove(g);
    }

}
