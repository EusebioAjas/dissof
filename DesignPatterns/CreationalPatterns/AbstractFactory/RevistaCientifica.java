public class RevistaCientifica extends Publicacion {

    public RevistaCientifica(String _nombre) {
        super(_nombre);
    }

    @Override
    public String toString() {
        return "Revista Cientifica: {" + " nombre=" + getNombre() + "}";
    }
}
