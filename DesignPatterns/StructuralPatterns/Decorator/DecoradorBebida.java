public abstract class DecoradorBebida extends Bebida{
    private Bebida bebida;

    public void addBebida(Bebida bebida){
        this.bebida = bebida;
    }

    public Bebida getBebida(){
        return this.bebida;
    }
}
