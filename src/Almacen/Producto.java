package Almacen;

public class Producto {

    /*----------ATRIBUTOS----------*/
    private String nombre;
    private double precio;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    /*----------GETTER-SETTER----------*/

    /*----------CONSTRUCTOR----------*/
    public Producto (String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;

    }
    /*----------CONSTRUCTOR----------*/

    /*----------MÉTODO----------*/
    @Override
    public String toString() {
        return "\nNombre : " + nombre +
                "\nPrecio : " + precio;
    }
    /*----------MÉTODO----------*/

}

