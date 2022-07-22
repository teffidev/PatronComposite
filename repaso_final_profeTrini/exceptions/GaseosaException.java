package semana_8.repaso_final_profeTrini.exceptions;

public class GaseosaException extends Exception{

    /*Es una clase más con un constructor y hacemos un "super" para poder
    * llamar a la Clase Padre, pero en esta clase en particular extiende en
    * Exception*/

    //Constructor
    public GaseosaException(String nombre){
        super("la bebida " + nombre + " no esta en la fabrica");
    }
}
