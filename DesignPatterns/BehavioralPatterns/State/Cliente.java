public class Cliente {
    public static void main(String[] args) {
        MEF mef = new MEF(new Dispositivo());
        mef.setEstado(new EstadoBloqueado());
    
        mef.moneda();
        mef.pasar();
        mef.pasar();
        mef.listo();
        mef.reiniciar();

    }
}