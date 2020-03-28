public class EstadoPromo implements EstadoDePrenda {

    private int valorPromo;

    public EstadoPromo(int valorPromo) {
        this.valorPromo = valorPromo;
    }

    @Override
    public int descuento(int precioInicial) {
        return valorPromo;
    }
}
