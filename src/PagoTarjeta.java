public class PagoTarjeta implements FormaDePago{

    private static final float COEFICIENTE_TARJETA = 0.1f;
    private int cuotas;

    public PagoTarjeta(int cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public int recargo(int monto) {
        return (int) (cuotas * (COEFICIENTE_TARJETA + monto * 0.01f));
    }
}
