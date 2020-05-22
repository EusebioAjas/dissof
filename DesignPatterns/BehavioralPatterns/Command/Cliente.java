public class Cliente {

    public Cliente() {
        Juego juego = new Juego();
        juego.setBotonA(new CommandCorrer());
        juego.setBotonX(new CommandDisparar());
        juego.setBotonB(new CommandInclinarse());
        juego.setBotonY(new CommandBrincar());

        juego.ejecutaComando(Boton.BOTON_A);
        juego.ejecutaComando(Boton.BOTON_Y);
        juego.ejecutaComando(Boton.BOTON_B);
        juego.ejecutaComando(Boton.BOTON_X);
    }

    public static void main(String[] args) {
        new Cliente();
    }
}
