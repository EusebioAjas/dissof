public class EstadoViolacion implements IEstado {
    @Override
    public void moneda(MEF mef) {
    }

    @Override
    public void pasar(MEF mef) {
    }

    @Override
    public void listo(MEF mef) {
        mef.dispositivo.reiniciarAlarma();
        mef.dispositivo.bloquear();
        mef.setEstado(new EstadoBloqueado());
    }

    @Override
    public void reiniciar(MEF mef) {
        mef.dispositivo.reiniciarAlarma();
    }

    @Override
    public String toString() {
        return "EstadoViolacion";
    }
}
