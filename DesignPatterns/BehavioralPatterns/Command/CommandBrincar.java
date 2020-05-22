public class CommandBrincar implements Command {
    @Override
    public void ejecutar(Personaje personaje) {
        personaje.brincar();
    }
}
