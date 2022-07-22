package semana_8.repaso_final_profeTrini;

import semana_8.repaso_final_profeTrini.exceptions.GaseosaException;

public class Main {

    public static void main(String[] args) throws Exception {

        FactoryGaseosas factoryGaseosas = FactoryGaseosas.getInstanciaFactory();

        try {
            factoryGaseosas.fabricarGaseosa("CocaCola");
            factoryGaseosas.fabricarGaseosa("Fanta");
            factoryGaseosas.fabricarGaseosa("Sprite");
            factoryGaseosas.fabricarGaseosa("Pepsi"); /*Ahora le pasamos una que no tengo*/
        } catch (NullPointerException e) {
            System.out.println("En la fabrica no hay PEPSI, te vamos a dar una CocaCola");
            factoryGaseosas.fabricarGaseosa("CocaCola");
        }
    }

}

