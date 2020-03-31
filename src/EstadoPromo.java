public class EstadoPromo implements EstadoDePrenda {

    private Double valorPromo;

    public EstadoPromo(Double valorPromo) {
        this.valorPromo = valorPromo;
    }

    @Override
    public Double descuento(Double precioInicial) {
        return valorPromo;
    }
}
