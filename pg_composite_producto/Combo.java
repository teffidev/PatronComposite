package semana_8.pg_composite_producto;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Comprable{

    private List<Comprable> comprables;


    public Combo() {
        comprables = new ArrayList<>();
    }


    @Override
    public Double calcularPrecio() {
        Double precioTotal = 0.0;
        for (Comprable comprable : comprables) {
            precioTotal += comprable.calcularPrecio();
        }
        return precioTotal;
    }
}
