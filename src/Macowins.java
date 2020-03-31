import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Macowins {

    private List<Venta> ventas = new ArrayList<>();

    public Macowins(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Macowins() { }

    public Double gananciasDelDia(LocalDateTime fecha){
        List<Venta> ventasDelDia = ventas.stream().filter( venta -> venta.getFecha().isEqual(fecha) ).collect(Collectors.toList());

        return ventasDelDia.stream().mapToDouble(Venta::precioFinal).sum();
    }
}
