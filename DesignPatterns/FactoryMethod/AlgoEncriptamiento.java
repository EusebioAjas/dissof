public abstract class AlgoEncriptamiento {

    abstract void configurar();

    abstract String encriptar(String texto);

    abstract String desencriptar(String textoEncriptado);
}