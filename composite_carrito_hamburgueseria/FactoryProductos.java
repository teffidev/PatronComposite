package semana_8.composite_carrito_hamburgueseria;

/*Quiero crear 3 tipos de combos - básico, premium, start
 * Para eso vamos a crear una factory*/

public class FactoryProductos {

    private static FactoryProductos instancia;

    private FactoryProductos(){

    }

    static FactoryProductos getInstance(){
        if (instancia == null){
            instancia = new FactoryProductos();
        }
        return instancia;
    }

    public Comprable crearProductoComprable(String nombreComprable){
        switch (nombreComprable){
            case "premium":
                ComboComposite premium = new ComboComposite("premium");
                premium.addProducto(new Sandwich("doble queso", 12.5));

                Sandwich sandwich = new Sandwich("doble queso", 12.5);
                Acompanamiento papas = new Acompanamiento("papas", 2.5, "grande");
                Acompanamiento bebida = new Acompanamiento("bebida", 8.75, "grande");

                premium.addProducto(papas);
                premium.addProducto(bebida);
                return premium;
            case "doble queso":
                /*Sandwich sandwich1 = new Sandwich("doble queso", 12.5);*/
                //Forma fácil de hacerlo:
                return new Sandwich("doble queso", 12.5);
            case "cake":
                return new Acompanamiento("bebida cake", 20.1, "extra grande");
            default:
                return null;
        }
    }

}
