package torniqueteSinState;

public class Estado {
    private Status STATUS;

    public Estado(Status status) {
        this.STATUS = status;
    }

    public Status getStatus() {
        return STATUS;
    }

    public void setStatus(Status status) {
        this.STATUS = status;
    }
}
