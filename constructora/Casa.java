package semana_8.constructora;

public class Casa implements Comprable{

    private String tipo;
    private Double metrosCuadrados;
    private Double precioMetro;
    private Integer ambientesMax;


    public Casa(String tipo, Double metrosCuadrados, Double precioMetro) {
        this.tipo = tipo;
        this.metrosCuadrados = metrosCuadrados;
        this.precioMetro = precioMetro;
    }

    public void setAmbientesMax(Integer ambientesMax){
        this.ambientesMax = ambientesMax;
    }


    @Override
    public Double obtenerPrecio() {
        Double total = 0.0;
        total = this.metrosCuadrados * precioMetro;
        return total;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }
}
