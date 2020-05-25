public class ChispasChocolate extends DecoradorBebida {

    @Override
    public double costo() {
        System.out.println("Chispas de chocolate");
        return this.getBebida().costo() + 4;
    }
}
