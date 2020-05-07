public class ArticuloCientifico extends Articulo {
    public ArticuloCientifico(String autor, String nombre) {
        super(autor, nombre);
    }

    @Override
    public String toString() {
        return "Articulo Cientifico: { "
                + "autor=" + getAutor() + ", "
                + "titulo=" + getTitulo() + " }";
    }
}