package semana_8.practica_final_jugueteria;

public class Juguete implements CuponAplicable {
    //Atributos
    private String nombre;
    private Integer edadMinima;
    private Double precio;


    //Constructor
    public Juguete(String nombre, Integer edadMinima, Double precio) {
        this.nombre = nombre;
        this.edadMinima = edadMinima;
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
