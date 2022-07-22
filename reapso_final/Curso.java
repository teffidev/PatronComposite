package semana_8.reapso_final;

public class Curso extends OfertaAcademica {

    private Double cantHoras;
    private Integer cantMeses;
    private Double precioHora;


    public Curso(String nombre, String descripcion, Double cantHoras, Integer cantMeses, Double precioHora) {
        super(nombre, descripcion);
        this.cantHoras = cantHoras;
        this.cantMeses = cantMeses;
        this.precioHora = precioHora;
    }


    @Override
    public Double calcularPrecio() {
        return this.cantHoras*this.cantMeses*this.precioHora;
    }

}
