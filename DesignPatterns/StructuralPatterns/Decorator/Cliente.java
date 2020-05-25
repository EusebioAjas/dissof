public class Cliente {
    public Cliente() {
        Bebida espresso = new Espresso();
        DecoradorBebida cremaBatida = new CremaBatida();
        cremaBatida.addBebida(espresso);
        DecoradorBebida chispasChocolate = new ChispasChocolate();
        chispasChocolate.addBebida(cremaBatida);

        System.out.println("El costo total de la bebida es: " + chispasChocolate.costo());
    }

    public static void main(String[] args) {
        new Cliente();
    }
}
