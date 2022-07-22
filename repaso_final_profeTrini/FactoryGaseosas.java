package semana_8.repaso_final_profeTrini;

import semana_8.repaso_final_profeTrini.exceptions.GaseosaException;

public class FactoryGaseosas {

    /*----Singleton---- No puedo crear instancias donde yo quiera!
    Tiene 3 elementos que son propios y sin esto no sería un Singleton:
     1. Un atributo static lo que hace que sea global y el que podre llamar en
     distintos lugares del programa.
     2. Tiene un constructor privado, para que no se pueda instanciar en otras clases o
      desde el main...(Puede estar vacío o puede contener elementos) siempre
      y cuando sea privado.
     3. Tiene un método Static porque yo voy a poder acceder desde cualquier sitio del
     programa a este método, el cual me va a devolver la instancia. */

    //Atributo
    private static FactoryGaseosas instanciaFactory;


    //Constructor privado
    private FactoryGaseosas(){}


    //Método
    /*Primero chequeamos si nuestro atributo es nulo, porque si es nulo, significa que nunca
     * se creó una fábrica y entonces lo vamos a crear dentro del If con un "new" y se puede
     * hacer porque el constructor es privado y lo estoy usando dentro de la misma clase y
     * en todos los casos voy a retornar mi instancia*/

    public static FactoryGaseosas getInstanciaFactory(){
        if (instanciaFactory == null){
            instanciaFactory = new FactoryGaseosas();
        }
        return instanciaFactory;
    }


    /*-----Factory----
    * Podemos tener un método que nos devuelva un Objeto, en este caso si yo estoy creando
    * gaseosas me debería devolver una Gaseosa a través de un parámetro.
    * Recibe un parámetro con el nombre con el tipo de gaseosa que se quiere,
    * ya sea una CocaCola, Fanta o Sprite.
    * Se recomienda hacer las condiciones con el SWITCH
    * ¿Y Qué pasa si el nombre de bebida es otra cosa? = Podemos devolver nulo
    * o tirar una Excepción... Lo que podemos hacer es generar una excepción custom,
    * que tire un mensaje... Pero antes debemos poner en la firma del método la relación
    * que indica la Excepción (throws Exception) y en defaul: throw new Exception().
    * Generamos un paquete de excepciones y hacemos la Clase "GaseosaException".*/
    public Gaseosa fabricarGaseosa(String nombreBebida) throws Exception {
        switch(nombreBebida){
            case "CocaCola":
                return new CocaCola();
            case "Fanta":
                return new Fanta();
            case "Sprite":
                return new Sprite();
            default:
                //return null; podemos devolver nulo o crear una excepción...
                throw new GaseosaException(nombreBebida);
        }

    }






















}
