package Almacen;

public class Prod_Alimenticio_NO_Perecedero extends Producto{
    /*----------ATRIBUTOS----------*/
    private int contenido;
    private int calorias;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    /*----------GETTER-SETTER----------*/

    /*----------CONSTRUCTOR----------*/
    public Prod_Alimenticio_NO_Perecedero (String nombre, double precio, int contenido, int calorias){
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;

    }
    /*----------CONSTRUCTOR----------*/

    /*----------MÉTODO----------*/
    @Override
    public String toString(){
        return super.toString() +
                "\nContenido : " + contenido +
                "\nCalorias : " + calorias;
    }
    /*----------MÉTODO----------*/
}
