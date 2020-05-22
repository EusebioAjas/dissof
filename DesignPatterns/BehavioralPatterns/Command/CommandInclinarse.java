public class CommandInclinarse implements Command {
    @Override
    public void ejecutar(Personaje personaje) {
        personaje.inclinarse();
    }
}
