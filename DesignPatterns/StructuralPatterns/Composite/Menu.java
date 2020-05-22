import java.util.ArrayList;
import java.util.stream.Collectors;

public class Menu extends ElementoMenu {
    private ArrayList<ElementoMenu> elementos;

    public Menu(String nombre) {
        super(nombre);
        elementos = new ArrayList<>();
    }

    public ArrayList<ElementoMenu> getElementos() {
        return elementos;
    }

    public void addElementoMenu(ElementoMenu subMenu) {
        this.elementos.add(subMenu);
    }

    @Override
    public String toPrint() {
        String submenu = elementos.stream().map(ElementoMenu::toPrint).collect(Collectors.joining());

        return String.format(">> %s\n\t%s\n\t", this.getNombre().toUpperCase(), submenu);
    }
}
