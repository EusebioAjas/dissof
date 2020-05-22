public class Platillo extends ElementoMenu{

    private double precio;

    public Platillo(String nombre, double precio) {
        super(nombre);
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toPrint() {
        return String.format("\t\t> %s $%s", this.getNombre(), getPrecio());
    }
}
