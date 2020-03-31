public class EstadoLiquidacion implements EstadoDePrenda{

    private final Double porcentajeLiquidacion = 0.5;

    @Override
    public Double descuento(Double precioInicial) {
        return precioInicial * porcentajeLiquidacion;
    }
}
