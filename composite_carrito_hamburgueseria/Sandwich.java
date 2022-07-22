package semana_8.composite_carrito_hamburgueseria;

public class Sandwich implements Comprable {

    private String tipo;
    private Double precio;


    public Sandwich(String tipo, Double precio) {
        this.tipo = tipo;
        this.precio = precio;
    }


    @Override
    public Double getPrecio() {
        return null;
    }
}
