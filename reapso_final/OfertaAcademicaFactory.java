package semana_8.reapso_final;

public class OfertaAcademicaFactory {

    /*Para Singleton
    1. Atributo de tipo static
    2. hacer privado al constructor para evitar que cualquiera pueda llamarlo
    3. método de tipo Static, me permite desde cualquier lugar llamar a la instancia.


    * Entonces, creo un atributo que va a ser de tipo Static que va a tener alcance global
    * será un Objeto de tipo OfertaAcademicaFactory y le pongo un nombre "instancia"
    * Estoy creando un atributo que tiene una instancia de sí mismo*/

    private static OfertaAcademicaFactory instancia;

    /*Yo no quiero que el constructor sea llamado desde cualquier lugar, quiero
    * que solo sea llamado desde la misma clase OfertaAcademicaFactory
    * entonces creamos el constructor privado y no le ponemos nada dentro
    * Es decir que yo no voy a poder hacer desde ningún lugar de mi aplicación
    * un "new" a OfertaAcademicaFactory, el único que lo podrá hacer es el mismo.*/

    private OfertaAcademicaFactory(){

    }

    /*Vamos a usar esa instancia que está flotando, entonces hacemos un método Static que va
    * a devolver el Objeto OfertaAcademicaFactory que se va a llamar getInstance() y
    * lo que hace es que si no se llama el constructor privado para poder crear algunas
    * de las clases, entonces la va a inicializar*/

    public static OfertaAcademicaFactory getInstance(){
        if (instancia == null){
            instancia = new OfertaAcademicaFactory();
        }
        return instancia;
    }


    /*Factory*/
    public OfertaAcademica crearOfertaAcademica(String ofertaAcademica){
        switch(ofertaAcademica){
            case "backend":
                /*Curso backend = new Curso("Backend", "", 20.0, 2, 900.0);
                * return backend;*/
                return new Curso("Backend", "", 20.0, 2, 900.0);
            case "frontend":
                return new Curso("Frontend", "", 16.0, 2, 1000.0);
            case "fullstack":
                Curso backend = new Curso("Backend", "", 20.0, 2, 900.0);
                Curso frontend =  new Curso("Frontend", "", 16.0, 2, 1000.0);
                Programa fullstack =  new Programa("Fullstack", "", 0.2);
                fullstack.agregarCurso(backend);
                fullstack.agregarCurso(frontend);
            return fullstack;
            default:
                return null;
        }
    }
}
