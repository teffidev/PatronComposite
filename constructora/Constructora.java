package semana_8.constructora;

import java.util.ArrayList;

public class Constructora {

    private ArrayList<Comprable> producto = new ArrayList<>();

    public void addProducto(Comprable c){
        this.producto.add(c);
    }

    public Double getPrecio(){
        Double total = 0.0;
        for (Comprable c : producto){
            total += c.obtenerPrecio();
        }
        return total;
    }

    public void generarInforme(){
        for (Comprable c : producto){
            System.out.println("Tipo: " + c.getTipo() + " Precio de lista: " + c.obtenerPrecio());
        }
    }
}
