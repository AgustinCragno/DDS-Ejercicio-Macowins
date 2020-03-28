import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Macowins {

    private List<Venta> ventas = new ArrayList<>();

    public Macowins(List<Venta> ventas) {
        this.ventas = ventas;
    }

    public Macowins() { }

    public int gananciasDelDia(int fecha){
        List<Venta> ventasDelDia = ventas.stream().filter( venta -> venta.getFecha() == fecha ).collect(Collectors.toList());

        return ventas.stream().mapToInt(Venta::precioFinal).sum();
    }
}
