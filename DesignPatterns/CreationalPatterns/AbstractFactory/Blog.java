public class Blog extends Publicacion {

    public Blog(String _nombre) {
        super(_nombre);
    }

    @Override
    public String toString() {
        return "Blog: {" + " nombre=" + getNombre() + " }";
    }
}