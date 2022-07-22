package semana_8.composite_carrito_hamburgueseria;

import java.util.ArrayList;

public class ComboComposite implements Comprable{

    private ArrayList<Comprable> productos;

    public ComboComposite(String premium) {
        this.productos = new ArrayList<>();
    }

    @Override
    public Double getPrecio() {
        Double valorTotal = 0.0;
        for (Comprable c : this.productos) {
            valorTotal += c.getPrecio();
        }
        /*Con descuento del 10%*/
        return valorTotal*0.9;
    }

    public void addProducto(Comprable c){
        this.productos.add(c);
    }

}