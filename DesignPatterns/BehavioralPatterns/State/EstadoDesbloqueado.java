public class EstadoDesbloqueado implements IEstado {
    @Override
    public void moneda(MEF mef) {
        mef.dispositivo.gracias();
    }

    @Override
    public void pasar(MEF mef) {
        mef.dispositivo.bloquear();
        mef.setEstado(new EstadoBloqueado());
    }

    @Override
    public void listo(MEF mef) {
    }

    @Override
    public void reiniciar(MEF mef) {
    }

    @Override
    public String toString() {
        return "EstadoDesbloqueado";
    }
}