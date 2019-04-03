
package ec.edu.ups.clases;

/**
 *Esta clase Propietario contine atributos, set´s y get's de sus atributos.
 * @author Darwin Leon
 */
public class Propietario {
    
    private String nombreP;
    private String apellidoP;
    private String rucP;
    private String nombreL;

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getNombre() {
        return nombreP;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombreP = nombre;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getApellido() {
        return apellidoP;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellidoP = apellido;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getRuc() {
        return rucP;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param ruc 
     */
    public void setRuc(String ruc) {
        this.rucP = ruc;
    }

    /**
     * El metodo nos permite recuperar el valor del parametro.
     * @return String
     */
    public String getNombreL() {
        return nombreL;
    }

    /**
     * El metodo nos permite designar un valor al parametro.
     * @param nombreL 
     */
    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }
    
    /**
     * Convierte un objeto "propietario" a String (cadena de texto).
     * @return cadena de texto con valores en los atributos
     */
    @Override
    public String toString() {
        return "Propietario ►►" + " Nombre= " + nombreP + ", Apellido =" + apellidoP +
                ", Ruc= " + rucP + ", Nombre del Local= " + nombreL ;
    }
    
    
}
