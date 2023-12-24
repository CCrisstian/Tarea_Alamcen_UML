package Almacen;

public class Carrito {
    /*----------ATRIBUTOS----------*/
    private Producto[] items;
    private int indiceItems;
    public static final int MAX_ITEMS = 7;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public Producto[] getItems() {
        return items;
    }

    public void setItems(Producto[] items) {
        this.items = items;
    }

    public int getIndiceItems() {
        return indiceItems;
    }

    public void setIndiceItems(int indiceItems) {
        this.indiceItems = indiceItems;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Carrito() {
        this.items = new Producto[MAX_ITEMS];
    }

    public void addItemCarrito(Producto item){
        if (indiceItems < MAX_ITEMS){
            this.items[indiceItems++] = item;
        }
    }

    public String GenerarDetalle(){
        StringBuilder Detalle = new StringBuilder();
        Detalle.append("____________________________________________________________________________________________________________\n");
        for (int i = 0; i < indiceItems; i++) {
            Detalle.append(this.items[i].toString()).append("\n");
        }
        Detalle.append("____________________________________________________________________________________________________________\n");
        return Detalle.toString();
    }

    @Override
    public String toString() {
        return GenerarDetalle();
    }
    /*----------CONSTRUCTOR----------*/


}

