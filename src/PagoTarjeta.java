public class PagoTarjeta implements FormaDePago{

    private static final Double COEFICIENTE_TARJETA = 0.1;
    private Double cuotas;

    public PagoTarjeta(Double cuotas) {
        this.cuotas = cuotas;
    }

    @Override
    public Double recargo(Double monto) {
        return cuotas * (COEFICIENTE_TARJETA + monto * 0.01);
    }
}
