public class PagoEfectivo implements FormaDePago {
    @Override
    public Double recargo(Double monto) {
        return 0.0;
    }
}
