import Almacen.*;

public class Main {
    public static void main(String[] args) {
        Vendedor Vendedor_1 = new Vendedor("Cristian","Cristaldo","12345","Calle 123");
        Vendedor Vendedor_2 = new Vendedor("Alejandro","Cristaldo","6789","Calle 123");


        Prod_Alimenticio_Perecedero alimento_1 = new Prod_Alimenticio_Perecedero("Fruta1",30D,2D);

        Prod_Limpieza NuevoLimpieza1 = new Prod_Limpieza("Limpieza1",6D,"Detergente",1D);

        Prod_Alimenticio_NO_Perecedero NoPerecible1 = new Prod_Alimenticio_NO_Perecedero("Picadillo",1D,3,30);

        Carrito Carrito_de_Compras = new Carrito();

        Carrito_de_Compras.addItemCarrito(alimento_1);
        Carrito_de_Compras.addItemCarrito(NuevoLimpieza1);
        Carrito_de_Compras.addItemCarrito(NoPerecible1);

        System.out.println("____________________________________________________________________________________________________________\n");
        System.out.println(Vendedor_1);
        System.out.println("____________________________________________________________________________________________________________\n");
        System.out.println(Vendedor_2);
        System.out.println("____________________________________________________________________________________________________________\n");
        Vendedor_2.setRemuneracion(Vendedor_2.AumentarRemuneracion(50));
        System.out.println(Vendedor_2);
        System.out.println("____________________________________________________________________________________________________________\n");
        System.out.println(Carrito_de_Compras);

    }
}