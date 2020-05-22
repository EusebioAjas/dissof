public class CommandCorrer implements Command {
    @Override
    public void ejecutar(Personaje personaje) {
        personaje.correr();
    }
}
