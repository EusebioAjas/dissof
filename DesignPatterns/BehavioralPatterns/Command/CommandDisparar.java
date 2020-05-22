public class CommandDisparar implements Command {
    @Override
    public void ejecutar(Personaje personaje) {
        personaje.disparar();
    }
}
