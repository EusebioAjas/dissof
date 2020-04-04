package torniqueteSinState;

public class Torniquete implements Bloqueable, Desbloqueable {
    private Estado estado = new Estado(Status.BLOQUEADO);

    @Override
    public void coin() {
        estado.setStatus(Status.DESBLOQUEADO);
    }

    @Override
    public void push() {
        estado.setStatus(Status.BLOQUEADO);
    }

    public Status getStatus() {
        return estado.getStatus();
    }
}
