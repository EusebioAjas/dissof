public class Espresso extends Bebida{

	public Espresso() {
		System.out.println("Espresso");
	}

	@Override
	public double costo() {
		return 5;
	}
}
