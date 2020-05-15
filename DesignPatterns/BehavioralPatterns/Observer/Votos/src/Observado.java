public interface Observado {
    void adicionarObservador(Observadores observador);

    void eliminarObservador(Observadores observador);

    void notificarTodos();
}
