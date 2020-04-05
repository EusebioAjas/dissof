package torniqueteConState;

public class TorniqueteDesbloquear implements IEstadoTorniquete {

    private final Torniquete torniquete;

    public TorniqueteDesbloquear(Torniquete torniquete) {
        this.torniquete = torniquete;
    }

    @Override
    public void bloquear() {
        System.out.println("BLOQUEADO");
        torniquete.setEstadoActual(torniquete.getTorniqueteBloqueado());
    }

    @Override
    public void desbloquear() {
        System.out.println("¡El torniquete ya esta en DESBLOQUEADO!");
    }
}
