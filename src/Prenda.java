public class Prenda {

    private int precio;
    private String tipo;
    private EstadoDePrenda estado;

    public Prenda(int precio, String tipo, EstadoDePrenda estado) {
        this.precio = precio;
        this.tipo = tipo;
        this.estado = estado;
    }

    public int precioDeVenta(){
        return precio - estado.descuento(precio);
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    public EstadoDePrenda getEstado() {
        return estado;
    }
}
