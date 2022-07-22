package semana_8.pg_composite_producto;

public class Producto implements Comprable {

    private String nombre;
    private Double precio;


    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    @Override
    public Double calcularPrecio() {
        return precio;
    }
}
