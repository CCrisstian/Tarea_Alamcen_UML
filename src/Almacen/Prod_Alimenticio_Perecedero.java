package Almacen;

public class Prod_Alimenticio_Perecedero extends Producto{
    /*----------ATRIBUTOS----------*/
    private double peso;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    /*----------GETTER-SETTER----------*/

    /*----------CONSTRUCTOR----------*/
    public Prod_Alimenticio_Perecedero (String nombre, double precio, double peso){
        super(nombre, precio);
        this.peso = peso;

    }
    /*----------CONSTRUCTOR----------*/

    /*----------MÉTODO----------*/
    @Override
    public String toString(){
        return super.toString() +
                "\nPeso : " + peso;
    }
    /*----------MÉTODO----------*/
}
