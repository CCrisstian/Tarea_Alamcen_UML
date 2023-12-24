package Almacen;

public class Persona {
    /*----------ATRIBUTOS----------*/
    private String nombre;
    private String apellido;
    private String numeroFiscal;
    private String direccion;
    /*----------ATRIBUTOS----------*/


    /*----------GETTER-SETTER----------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroFiscal() {
        return numeroFiscal;
    }

    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }
    /*----------CONSTRUCTOR----------*/


    /*----------MÉTODO----------*/
    @Override
    public String toString() {
        return "Nombre: "+ nombre +
                "\nApellido: "+ apellido +
                "\nNúmero Fiscal: "+ numeroFiscal +
                "\nDirección: "+ direccion;
    }
    /*----------MÉTODO----------*/
}
