package semana_8.reapso_final;

public class Test {

    public static void main(String[] args) {

        /*Creamos algunos cursos con la clase factory, donde n vez de usar un "new"
        * vamos a llamar a la clase factory directamente, donde llamamos a la instancia*/

        OfertaAcademicaFactory fabrica = OfertaAcademicaFactory.getInstance();

        /*Podemos llamar a la fábrica, pero para que los métodos puedan ser llamados
        * desde afuera usamos su método "crearOfertaAcademica"*/

        OfertaAcademica backend = fabrica.crearOfertaAcademica("backend");
        OfertaAcademica fullstack = fabrica.crearOfertaAcademica("fullstack");
        OfertaAcademica frontend = fabrica.crearOfertaAcademica("frontend");

        /*Imprimimos por pantalla*/

        System.out.println("curso " + backend.getNombre() + " costo: " + backend.calcularPrecio());
        System.out.println("curso " + fullstack.getNombre() + " costo: " + fullstack.calcularPrecio());
        System.out.println("curso " + frontend.getNombre() + " costo: " + frontend.calcularPrecio());


        /*Método en el instituto, donde podriamos agregar los 3 cursos*/

        Instituto inst = new Instituto();
        inst.agregarOfertas(backend);
        inst.agregarOfertas(frontend);
        inst.agregarOfertas(fullstack);
        inst.generarInforme();

    }

}
