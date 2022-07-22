package semana_8.practica_final_jugueteria;

import java.util.ArrayList;

public class Jugueteria {

    private ArrayList<CuponAplicable> productos;


    public void agregarProductos(CuponAplicable c){
        if(this.productos == null){
            this.productos = new ArrayList<>();
        }
        this.productos.add(c);
    }

    public void generarReporte(){
        for (CuponAplicable c : this.productos){
            System.out.println("El producto " + c.getClass() + " tiene un costo de " + c.getPrecio());
        }

    }
}
