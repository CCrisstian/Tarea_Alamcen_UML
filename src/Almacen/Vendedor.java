package Almacen;

public class Vendedor extends Persona{
    /*----------ATRIBUTOS----------*/
    private Double remuneracion;
    private int empleadoId;
    private static int UltimoEmpleadoId;
    /*----------ATRIBUTOS----------*/


    /*----------GETTER-SETTER----------*/
    public Double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Vendedor(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = 1000D;
        this.empleadoId = ++UltimoEmpleadoId;
    }
    /*----------CONSTRUCTOR----------*/


    /*----------MÉTODO----------*/
    @Override
    public String toString() {
        return super.toString() +
                "\nRemuneración: "+ remuneracion +
                "\nEmpleadoId: "+ empleadoId;
    }

    public Double AumentarRemuneracion(int porcentaje){
        double porcentajeD = (double) porcentaje /100;
        return (this.remuneracion + (this.remuneracion * porcentajeD));
    }
    /*----------MÉTODO----------*/
}
