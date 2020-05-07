public class FactoryDivulgacion implements FactoryPublicacionArticulo {

    @Override
    public Articulo createArticulo(String autor, String nombre) {
        return new ArticuloDivulgacion(autor, nombre);
    }

    @Override
    public Publicacion createPublicacion(String nombre) {
        return new Blog(nombre);
    }
}
