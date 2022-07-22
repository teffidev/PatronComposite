package semana_8.practica_final_jugueteria;

public class Disfraz implements CuponAplicable {
    //Atributos
    private String descripcion;
    private String talle;
    private Double precio;



    //Constructor
    public Disfraz(String descripcion, String talle, Double precio) {
        this.descripcion = descripcion;
        this.talle = talle;
        this.precio = precio;
    }

    //Métodos
    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Double aplicarDescuento(String s) {
        if (s.equals("cupon15")) {
            return this.precio * 0.85;
        } else if (s.equals("cupon30")) {
            return this.precio * 0.70;
        } else {
            System.out.println("El cupon no es valido");
            return this.precio;
        }
    }

}
