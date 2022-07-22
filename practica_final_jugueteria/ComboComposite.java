package semana_8.practica_final_jugueteria;

import java.util.ArrayList;

public class ComboComposite implements CuponAplicable {
    //Atributos
    private Integer codigo;
    private ArrayList<CuponAplicable> productos = new ArrayList<>();


    //Constructor
    public ComboComposite(Integer codigo) {
        this.codigo = codigo;
    }

    public void agregarProducto(CuponAplicable c){
        this.productos.add(c);

    }


    //Métodos
    @Override
    public Double getPrecio() {
        Double precioTotal = 0.0;
        for(CuponAplicable c : this.productos){
            precioTotal += c.getPrecio();
        }
        return precioTotal * 0.85;
    }



    @Override
    public Double aplicarDescuento(String s) {
        if (s.equals("cupon15")) {
            return this.getPrecio() * 0.85;
        } else {
            return this.getPrecio() * 0.70;
        }
    }
}
