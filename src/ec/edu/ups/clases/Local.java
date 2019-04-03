
package ec.edu.ups.clases;

/**
 * Esta clase Local contine atributos, set´s y get's de sus atributos.
 * @author Darwin Leon
 */
public class Local {
    
    private String nombreL;
    private String direccionL;
    private String telefonoL;
    private String url;
      
    
    /**
     * Este metodo se encarga de regresar una cadena de texto
     * @return el atributo con el valor ya asignado
     */
    public String getNombreL() {
        return nombreL;
    }
    
    /**
     * En este metodo asiganos una valor (cadena de texto) al atributo "nombreL"
     * @param nombreL es una cadena de texto con el "nombreL" a usar.
     */
    public void setNombreL(String nombreL) {
        this.nombreL = nombreL;
    }

    /**
     * Este metodo regresa un valor (cadena de texto) 
     * @return el atributo con el valor ya asignado
     */
    public String getDireccionL() {
        return direccionL;
    }

    /**
     * Asiganamos un valor (String) al atributo direccionL. 
     * @param direccionL tomara el valor que se le asigne mediante consola y pasará al atributo
     */
    public void setDireccionL(String direccionL) {
        this.direccionL = direccionL;
    }

    /**
     * regresa una valor de tipo String
     * @return el atributo ya con un valor asignado.
     */
    public String getTelefonoL() {
        return telefonoL;
    }

    /**
     * Establecemos un valor de tipo String al atributo de la clase
     * @param telefonoL tomará el valor asignado mediante consola
     */
    public void setTelefonoL(String telefonoL) {
        this.telefonoL = telefonoL;
    }

    /**
     * regresa un valor de tipo String
     * @return el atributo con un valor ya establecido
     */
    public String getUrl() {
        return url;
    }

    /**
     * Establecemos valor al atributo de la clase.
     * @param url tomara dicho valor que le asignemos.
     */
    public void setUrl(String url) {
        this.url = url;
    }
    
    /**
     * Convierte un objeto "local" a String (cadena de texto).
     * @return cadena de texto con valores en los atributos
     */
    @Override
    public String toString() {
        return "Local ►►" + " Nombre del Local= " + nombreL + ", Direccion= " + direccionL + 
                ", Telefono= " + telefonoL + ", Sitio Web= " + url ;
    }
    
    
}
