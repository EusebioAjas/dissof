public class CremaBatida extends DecoradorBebida {

    @Override
    public double costo() {
        System.out.println("Crema batida");
        return this.getBebida().costo() + 2;
    }
}
