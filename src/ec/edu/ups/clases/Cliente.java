
package ec.edu.ups.clases;

/**
 * Esta clase Cliente contine atributos, set´s y get's de sus atributos.
 * @author Darwin Leon
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String ruc;
    private String direccion;

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return  String
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * El metodo nos permite designar un valor al parametro.
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param ruc 
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param direccion 
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
     * Convierte un objeto "cliente" a String (cadena de texto).
     * @return cadena de texto con valores en los atributos
     */
    @Override
    public String toString() {
        return "Cliente ►►" + " Nombre= " + nombre + ", Apellido= " + apellido + ", Ruc= " + ruc + 
                ", Dirección= " + direccion ;
    }
    
    
    
}
