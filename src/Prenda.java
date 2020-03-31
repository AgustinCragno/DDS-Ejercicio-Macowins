public class Prenda {

    private Double precio;
    private TipoDePrenda tipo;
    private EstadoDePrenda estado;

    public Prenda(Double precio, TipoDePrenda tipo, EstadoDePrenda estado) {
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
    }

    public Double precioDeVenta(){
        return precio - estado.descuento(precio);
    }

    public Double getPrecio() {
        return precio;
    }

    public TipoDePrenda getTipo() {
        return tipo;
    }

    public EstadoDePrenda getEstado() {
        return estado;
    }
}
