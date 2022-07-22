package semana_8.practica_final_jugueteria;

public class JuegoDeMesa implements CuponAplicable{
    //Atributos
    private String nombre;
    private Integer cantJugMin;
    private Integer cantJugMax;
    private Double precio;


    //Constructor
    public JuegoDeMesa(String nombre, Integer cantJugMin, Integer cantJugMax, Double precio) {
        this.nombre = nombre;
        this.cantJugMin = cantJugMin;
        this.cantJugMax = cantJugMax;
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
        } else {
            return this.precio * 0.70;
        }
    }
}
