import java.util.ArrayList;
import java.util.List;

public class Picture implements GraphicComponent {

    private List<GraphicComponent> childGraphics = new ArrayList<GraphicComponent>();

    @Override
    public void print() {
        for (GraphicComponent graphicComponent : childGraphics) {
            graphicComponent.print();
        }
    }

    @Override
    public void add(GraphicComponent g) {
        childGraphics.add(g);
    }

    @Override
    public void remove(GraphicComponent g) {
        childGraphics.remove(g);
    }
}
