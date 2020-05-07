public class Cliente {
    public static void main(String[] args) {
        FactoryAlgoEncriptamiento factoryAlgoEncript = new FactoryAlgoEncriptKHash();
        Cliente cliente = new Cliente();
        String cadenaEncriptada = cliente.encriptar("Hola",factoryAlgoEncript);
        System.out.println(cadenaEncriptada);
    }

    public String encriptar(String texto, FactoryAlgoEncriptamiento algoritmo) {
        AlgoEncriptamiento algo = algoritmo.createInstance();
        String textoEncriptado = algo.encriptar(texto);
        return textoEncriptado;
    }
}