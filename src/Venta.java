import java.util.Arrays;

public class Venta {

    private Prenda[] prendas;
    private int fecha;
    private FormaDePago pago;

    public Venta(Prenda[] prendas, int fecha, FormaDePago pago) {
        this.prendas = prendas;
        this.fecha = fecha;
        this.pago = pago;
    }

    private int precioDeVenta(){
        return Arrays.stream(prendas).mapToInt(Prenda::precioDeVenta).sum();
    }

    public int precioFinal(){
        int precioInicial = precioDeVenta();

        return precioInicial + pago.recargo(precioInicial);
    }

    public Prenda[] getPrendas() { return prendas; }
    public int getFecha() { return fecha; }
    public FormaDePago getPago() { return pago; }
}
