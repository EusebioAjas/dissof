public class ArticuloDivulgacion extends Articulo {
    public ArticuloDivulgacion(String autor, String nombre) {
        super(autor, nombre);
    }

    @Override
    public String toString() {
        return "Articulo Divulgacion: {" + "autor=" + getAutor() + ", titulo=" + getTitulo() + " }";
    }
}
