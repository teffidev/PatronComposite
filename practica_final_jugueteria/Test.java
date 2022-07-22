package semana_8.practica_final_jugueteria;

public class Test {

    public static void main(String[] args) {

        CuponAplicableFactory f = CuponAplicableFactory.getInstance();
        CuponAplicable sp = f.fabricarProducto("Spiderman");
        CuponAplicable comboN = f.fabricarProducto("Combo Navidad");
        CuponAplicable life = f.fabricarProducto("Life");


        System.out.println("Spiderman con descuento " + sp.aplicarDescuento("cupon15"));
        //System.out.println("Combo " + comboN.aplicarDescuento("cupon15"));


        Jugueteria jugueteria = new Jugueteria();
        jugueteria.agregarProductos(sp);
        jugueteria.agregarProductos(comboN);
        jugueteria.agregarProductos(life);

        jugueteria.generarReporte();



    }

}
