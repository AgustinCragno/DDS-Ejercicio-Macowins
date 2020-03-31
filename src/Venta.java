import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Venta {

    private List<Prenda> prendas;
    private LocalDateTime fecha;
    private FormaDePago pago;

    public Venta(List<Prenda> prendas, LocalDateTime fecha, FormaDePago pago) {
        this.prendas = prendas;
        this.fecha = fecha;
        this.pago = pago;
    }

    private Double precioDeVenta(){
        return prendas.stream().mapToDouble(Prenda::precioDeVenta).sum();
    }

    public Double precioFinal(){
        Double precioInicial = precioDeVenta();

        return precioInicial + pago.recargo(precioInicial);
    }

    public List<Prenda> getPrendas() { return prendas; }
    public LocalDateTime getFecha() { return fecha; }
    public FormaDePago getPago() { return pago; }
}
