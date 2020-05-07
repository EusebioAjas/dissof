public class FactoryAlgoEncriptKHash implements FactoryAlgoEncriptamiento {
    @Override
    public AlgoEncriptamiento createInstance() {
        AlgoEncriptamiento algo = new KHash();
        algo.configurar();
        return algo;
    }
}
