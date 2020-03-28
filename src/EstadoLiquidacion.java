public class EstadoLiquidacion implements EstadoDePrenda{

    private final float porcentajeLiquidacion = 0.5f;

    @Override
    public int descuento(int precioInicial) {
        return (int) (precioInicial * porcentajeLiquidacion);
    }
}
