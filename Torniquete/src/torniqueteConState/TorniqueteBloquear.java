package torniqueteConState;

public class TorniqueteBloquear implements IEstadoTorniquete {

    private final Torniquete torniquete;

    public TorniqueteBloquear(Torniquete torniquete) {
        this.torniquete = torniquete;
    }

    @Override
    public void bloquear() {
        System.out.println("¡El torniquete ya esta en BLOQUEADO!");
    }

    @Override
    public void desbloquear() {
        System.out.println("DESBLOQUEADO");
        torniquete.setEstadoActual(torniquete.getTorniqueteDesbloqueado());
    }
}
