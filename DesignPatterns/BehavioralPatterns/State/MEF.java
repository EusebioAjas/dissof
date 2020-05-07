public class MEF {
    public Dispositivo dispositivo;
    IEstado estadoActual;

    public MEF(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void setEstado(IEstado estado) {
        this.estadoActual = estado;
    }

    public void moneda() {
        estadoActual.moneda(this);
    }

    public void pasar() {
        estadoActual.pasar(this);
    }

    public void listo() {
        estadoActual.listo(this);
    }

    public void reiniciar() {
        estadoActual.reiniciar(this);
    }

    @Override
    public String toString() {
        return "Estado actual: " + estadoActual.toString();
    }
}
