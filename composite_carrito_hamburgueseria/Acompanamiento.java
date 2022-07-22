package semana_8.composite_carrito_hamburgueseria;

public class Acompanamiento implements Comprable{

    private String tipo;
    private Double precio;
    private String tamagnio;

    public Acompanamiento(String tipo, Double precio, String tamagnio) {
        this.tipo = tipo;
        this.precio = precio;
        this.tamagnio = tamagnio;
    }


    @Override
    public Double getPrecio() {
        return null;
    }
}
