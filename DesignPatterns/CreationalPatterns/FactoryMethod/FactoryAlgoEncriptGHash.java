public class FactoryAlgoEncriptGHash implements FactoryAlgoEncriptamiento {

    @Override
    public AlgoEncriptamiento createInstance() {
        AlgoEncriptamiento algo = new GHash();
        algo.configurar();
        return algo;
    }
}
