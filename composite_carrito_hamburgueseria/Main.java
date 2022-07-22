package semana_8.composite_carrito_hamburgueseria;

public class Main {

    public static void main(String[] args) {

        FactoryProductos fac = FactoryProductos.getInstance();

        Comprable dobleQueso = fac.crearProductoComprable("doble queso");

        System.out.println("Precio: " + dobleQueso.getPrecio());

        Comprable combo = fac.crearProductoComprable("premium");

        System.out.println("precio: " + combo.getPrecio());

    }

}
