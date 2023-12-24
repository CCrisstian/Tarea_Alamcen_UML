package Almacen;

public class Prod_Limpieza extends Producto{

    /*----------ATRIBUTOS----------*/
    private String componentes;
    private double litros;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
    /*----------GETTER-SETTER----------*/

    /*----------CONSTRUCTOR----------*/
    public Prod_Limpieza (String nombre, double precio, String componentes, double litros){
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }
    /*----------CONSTRUCTOR----------*/

    /*----------MÉTODO----------*/
    @Override
    public String toString(){
        return super.toString() +
                "\nComponentes : " + componentes +
                "\nLitros : " + litros;
    }
    /*----------MÉTODO----------*/

}
