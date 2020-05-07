public class Cliente {
    private Articulo art;
    private Publicacion pub;
    private FactoryPublicacionArticulo factoryPublicacionArticulo;

    public Cliente(String autor, String tituloArticulo, String tituloRevista, FactoryPublicacionArticulo factory) {
        factoryPublicacionArticulo = factory;
        art = factory.createArticulo(autor, tituloArticulo);
        pub = factory.createPublicacion(tituloRevista);
    }

    public static void main(String[] args) {
        Cliente cliente;
        /*cliente = new Cliente(
                "woods",
                "Foreign Forever",
                "Journal Migration",
                new FactoryDivulgacion()
        );*/
        cliente = new Cliente(
                "woods",
                "Foreign Forever",
                "Journal Migration",
                new FactoryCientifico()
        );
        System.out.println(cliente.getArt());
        System.out.println(cliente.getPub());
    }

    public Articulo getArt() {
        return art;
    }

    public Publicacion getPub() {
        return pub;
    }
}