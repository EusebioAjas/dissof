public class Juego {
    private Personaje personajeActivo;
    private Command botonA;
    private Command botonB;
    private Command botonX;
    private Command botonY;


    public Juego() {
        personajeActivo = new Personaje();
    }

    public void ejecutaComando(Boton btnPresionado) {
        procesaEntrada(btnPresionado);
    }

    private void procesaEntrada(Boton btnPresionado) {
        if (btnPresionado == Boton.BOTON_A) botonA.ejecutar(personajeActivo);
        if (btnPresionado == Boton.BOTON_B) botonB.ejecutar(personajeActivo);
        if (btnPresionado == Boton.BOTON_X) botonX.ejecutar(personajeActivo);
        if (btnPresionado == Boton.BOTON_Y) botonY.ejecutar(personajeActivo);
    }

    public void setBotonA(Command botonA) {
        this.botonA = botonA;
    }

    public void setBotonB(Command botonB) {
        this.botonB = botonB;
    }

    public void setBotonX(Command botonX) {
        this.botonX = botonX;
    }

    public void setBotonY(Command botonY) {
        this.botonY = botonY;
    }
}
