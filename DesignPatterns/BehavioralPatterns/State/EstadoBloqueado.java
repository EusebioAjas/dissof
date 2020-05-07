public class EstadoBloqueado implements IEstado {
    @Override
    public void moneda(MEF mef) {
        mef.dispositivo.desbloquear();
        mef.setEstado(new EstadoDesbloqueado());
    }

    @Override
    public void pasar(MEF mef) {
        mef.dispositivo.alarma();
        mef.setEstado(new EstadoViolacion());
    }

    @Override
    public void listo(MEF mef) {
    }

    @Override
    public void reiniciar(MEF mef) {
    }

    @Override
    public String toString() {
        return "EstadoBloqueado";
    }
}
