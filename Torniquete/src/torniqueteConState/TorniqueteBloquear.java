package torniqueteConState;

public class TorniqueteBloquear implements IEstadoTorniquete {

    private final Torniquete torniquete;

    public TorniqueteBloquear(Torniquete torniquete) {
        this.torniquete = torniquete;
    }

    @Override
    public void bloquear() {
        System.out.println("El torniquete ya esta Bloqueado!");
    }

    @Override
    public void desbloquear() {
        System.out.println("El torniquete esta Desbloqueado!");
        torniquete.setEstadoActual(torniquete.getTorniqueteDesbloqueado());
    }
}
