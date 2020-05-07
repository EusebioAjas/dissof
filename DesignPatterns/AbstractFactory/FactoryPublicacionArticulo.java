public interface FactoryPublicacionArticulo {
    Articulo createArticulo(String autor, String nombre);

    Publicacion createPublicacion(String nombre);
}