package torniqueteConState;

public class Torniquete implements IEstadoTorniquete {

    private IEstadoTorniquete torniqueteBloqueado;
    private IEstadoTorniquete torniqueteDesbloqueado;

    private IEstadoTorniquete estadoActual;

    public Torniquete() {
        this.torniqueteBloqueado = new TorniqueteBloquear(this);
        this.torniqueteDesbloqueado = new TorniqueteDesbloquear(this);

        this.estadoActual = this.torniqueteDesbloqueado;
    }

    @Override
    public void bloquear() {
        this.estadoActual.bloquear();
    }

    @Override
    public void desbloquear() {
        this.estadoActual.desbloquear();
    }

    public IEstadoTorniquete getTorniqueteBloqueado() {
        return torniqueteBloqueado;
    }

    public IEstadoTorniquete getTorniqueteDesbloqueado() {
        return torniqueteDesbloqueado;
    }

    public IEstadoTorniquete getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(IEstadoTorniquete estadoActual) {
        this.estadoActual = estadoActual;
    }

}
